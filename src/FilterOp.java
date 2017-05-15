
public abstract class FilterOp {
  private FilterOp nextOp;

  public FilterOp nextOp(FilterOp o) {
    nextOp = o;
    return o;
  }

  public apply(Imagem img) throws FilterError {
    op(img);
    nextOp.apply(img);
  }

  public abstract op(Imagem i) throws FilterError;

  public void apply() {	
  }
}