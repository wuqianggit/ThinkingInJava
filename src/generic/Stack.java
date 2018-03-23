package generic;

/**
 * 栈的接口
 * @param <T>
 */
public interface Stack<T> {

    T pop();/*取最上层的数据*/

    void push(T item);/*塞一个值*/

    boolean hasNext();/*是否有下一个元素*/

}
