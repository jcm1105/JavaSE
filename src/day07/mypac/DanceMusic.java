package day07.mypac;

public class DanceMusic implements Music, Singer {
	i
	private String genre;
	private String name;
	private String groupName;
	
	public DanceMusic() {
		this.genre = "dance";
		this.name = "ĵ��";
		this.groupName = "NCT DREAM";
	}
	
	@Override
	public void setGenre(String genre) {
		this.genre = genre;
		
		
	}

	@Override
	public String getGenre() {
		
		return genre;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getName() {
		return name;
		
	}

	@Override  //������̼� - �ΰ����� �Ǵ� �߰���� ����. ��������ε� ��� ������ up~
	public void listen() {
		System.out.println("��ĩ��ĩ");
		
	}

	@Override
	public void sing() {
		System.out.println("Į������ �뷡�� �ҷ���!");
		
	}

	@Override
	public String getGroup() {
		
		return groupName;
	}

	@Override
	public void setgroupName() {
		this.groupName = groupName;
		
	}

	
		
	}


