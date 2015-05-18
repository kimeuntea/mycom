package game;

public class NumberMatchVo {
	private int player, com, count; 


	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		if(player < 1 || player >5){
			System.out.println("1부터 5까지 정수만 입력해야 합니다.");
		}else{
			this.player = player;	
		}
	}

	public int getCom() {
		return com;
	}

	public void setCom() {
		this.com = (int)((Math.random()*5)+1);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	} 

}
