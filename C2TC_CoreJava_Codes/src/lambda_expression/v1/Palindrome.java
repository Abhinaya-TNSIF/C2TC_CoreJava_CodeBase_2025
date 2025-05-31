//Program to define generic functional interface Palindrome

package lambda_expression.v1;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
