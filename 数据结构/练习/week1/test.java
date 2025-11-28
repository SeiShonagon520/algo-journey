public class test {
    public void insert(int i, Object x) throws Exception {
    //1) 插入时判断是否已满, 若满, 则抛出异常
    if(curLen==listElem.length)
        throw new Exception("顺序表已满");
    //2) 判断插入位置i是否合法, 不合法则抛出异常
    if(i<0 || i>curLen)
        throw new Exception("插入位置不合法");
    //3)元素移动-第i个位置上的元素和之后的元素向后移动一位
    for(int j=curLen;j>i;j--)
    {
        listElem[j]=listElem[j-1];
    }
    //4)插入x
    listElem[i]=x;
    //5)元素个数+1, 表长+1
    curLen++;
}

}
