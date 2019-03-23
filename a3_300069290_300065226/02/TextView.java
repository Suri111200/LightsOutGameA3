public class TextView implements View {
	private GameModel model ;
	
	public TextView (GameModel model) {
		this.model = model ;
	}
	public void update() {
		System.out.println(model.toString()) ;
	}
}