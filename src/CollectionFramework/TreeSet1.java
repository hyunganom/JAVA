package CollectionFramework;

public class TreeSet1 {
}
//TreeSet - 범위 탐색, 정렬
//-이진 탐색 트리(binary search tree)로 구현. 범위 탐색과 정렬에 유리.
//-이진 트리는 모든 노드가 최대 2개의 하위 노드를 갖음
//각 요소(node)가 나무(tree)형태로 연결(LinkedList의 변형)

//이진 탐색 트리(binary search tree)
//-부모보다 작은 값은 왼쪽, 큰 값은 오른쪽에 저장.
//-데이터가 많아질 수록 추가, 삭제에 시간이 더 걸림(비교 횟수 증가)

//TreeSet - 데이터 저장과정 boolean add(Object o)
//TreeSet에 7,4,9,1,5의 순으로 데이터를 저장하면, 아래의 과정을 거친다.
//(루트부터 트리를 따라 내려가며 값을 비교, 작으면 왼쪽, 크면 오른쪽에 저장)

