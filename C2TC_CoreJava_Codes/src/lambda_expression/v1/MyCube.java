//Define Functional Interface MyCube
package lambda_expression.v1;

@FunctionalInterface
public interface MyCube {
	int getCube(int no);
	//void show(); not allow more than one abstract method
}
