package jun.yu.maven.test.easymock;

public class IncomeCalculator {
private ICalcMethod calcMethod;
private Position position;

public void setCalcMethod (ICalcMethod calcMethod ){
    this.calcMethod=calcMethod;
}

public void setPosition(Position position) {
    this.position = position;
}
//CommentTest1
public double calc(){
    if(calcMethod==null){
        throw new RuntimeException("CalcMethod not defined");
    }
    if(position ==null){
        throw new RuntimeException("Position not defined");
    }
    return calcMethod.calc(position);
}

}
