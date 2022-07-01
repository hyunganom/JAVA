package CollectionFramework;

public class LinkedList1 {
}
//LinkedList

//배열의 장단점
//장점 : 구조가 간단하고 데이터를 읽는데 걸리는 시간(접근시간, access time)이 짧다.
//단점1 : 크기를 변경할수없다.
//크기를 변경해야하는 경우 새로운 배열을 생성 후 데이터를 복사해야함.
//크기변경을 피하기 위해 충분히 큰 배열을 생성하면, 메모리가 낭비됨.
//단점2 : 비순차적인 데이터를 추가, 삭제에 시간이 많이 걸린다.
//데이터를 추가하거나 삭제하기 위해, 다른 테이터를 옮겨야함.
//그러나 순차적인 데이터 추가(끝에 추가)와 삭제(끝부터 삭제)는 빠르다.


//Linked list - 배열의 단점을 보완
//배열과 달리 링크드리스트는 불연속적으로 존재하는 데이터를 연결(link)
//데이터의 삭제 : 단 한 번의 참조변경만으로 가능
//데이터의 추가 : 한번의 Node객체생성과 두 번의 참조변경만으로 가능
