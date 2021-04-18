
public class NewExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("�����޽��� : "+e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		} catch (MemoryException e) {
			System.out.println("�����޽��� : "+e.getMessage());
			e.printStackTrace();
			System.gc();
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");			
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		if(!enoughSpace()) 
			throw new MemoryException("�޸𸮰� �����մϴ�.");
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	static boolean enoughSpace() {
		return false;
	}

}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}