
public class FabricaDeFiltros {

	public FilterOp gotham(){
		FilterOp f = new Modulate(120, 10, 100);
		f.nextOp(new Fill(#222b6d)).nextOp(new Colorize(20)).nextOp(new Gamma()).nextOp(new Contrast());
		return f;
		
	}
	
	public FilterOp sky() {
		FilterOp f = new Modulate(120,10,100)
			.nextOp(new Fill(#0000FF))
			.nextOp(new Gamma(1))
			.nextOp(new Contrast());
		return f;
	}
}
