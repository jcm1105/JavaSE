package day07.mypac;

public class DanceMusic implements Music, Singer {
	i
	private String genre;
	private String name;
	private String groupName;
	
	public DanceMusic() {
		this.genre = "dance";
		this.name = "캔디";
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

	@Override  //어노테이션 - 부가정보 또는 추가기능 제공. 명시적으로도 사용 가독성 up~
	public void listen() {
		System.out.println("둠칫둠칫");
		
	}

	@Override
	public void sing() {
		System.out.println("칼군무와 노래를 불러요!");
		
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


