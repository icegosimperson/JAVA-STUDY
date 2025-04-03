# 힙이란?

- 최댓값, 최솟값을 빠르게 찾기 위한 자료형
- 우선순위 큐를 위해 만들어짐
- 완전 이진 트리의 일종이다.
- 각 노드의 키 값이 그 자식의 키 값보다 작지 않거나 크지 않은 완전 이진 트리이다.
    - 최대 힙
    - 최소 힙

### 완전 이진트리는 중복을 허용하지 않지만 힙은 허용한다.

![image.png](attachment:5a0bd4f3-2354-43d6-8cb8-4126f07d47cc:image.png)

## 특징

### 힙에서의 부모 자식 관계

- 오른쪽 자식의 인덱스 = (부모의 인덱스) * 2+1
- 왼쪽 자식의 인덱스 = (부모의 인덱스) * 2
- 부모의 인덱스 = (자식의 인덱스) / 2
- 중복값을 허용
- 부모-자식 간 정렬은 보장, 형제간의 정렬은 보장하지 않는 반 정렬 상태

## 사용이유

최솟값이나 최댓값을 찾기 위해

## 시간 복잡도

**최솟값이나 최댓값을 찾기 위해 배열을 사용하면 Ο(n)만큼 시간이 걸린다.하지만 힙을 사용하면 O(logn)만큼 소요되므로, 배열을 사용할 때보다 빠르게 최솟값과 최댓값을 구할 수 있다.**

![image.png](attachment:fc59edb6-80a5-42ca-b0bf-e2d5d035e066:image.png)

## 최대 힙 & 최소 힙

힙은 기본적으로 노드가 왼쪽부터 체워지는 완전 이진 트리이다.

![image.png](attachment:6fac3f71-f508-4f76-bff7-1270f4d4bfb1:image.png)

## 완전 이진 트리

![image.png](attachment:f6e837c6-24ae-43c4-8d89-2bb9145658e7:image.png)

## 이진 탐색 트리

이진 탐색과 연결리스트(linked-list)를 결합한 자료구조의 일종이다.

이진 탐색의 효율적인 탐색 능력을 유지하면서 빈번한 자료의 입력과 삭제를 가능하도록 한다.

각 노드에서 왼쪽의 자식 노드는 해당 노드보다 작은 값으로, 오른쪽의 자식 노드는 해당 노드보다 큰 값으로 이루어져 있다.

- 공통점

모두 완전 이진 트리이다.

- 차이점

최대힙의 경우에는 각 노드의 값이 자식 노드보다 크거나 같다.이진 탐색 트리는 각 노드의 왼쪽 자식은 더 작은 값으로, 오른쪽 자식은 더 큰 값으로 이루어져있다.

왼쪽 자식 노드 < 부모 노드 < 오른쪽 자식 노드

![image.png](attachment:dd1284e5-291d-449d-9edf-e3437c873690:image.png)

## 힙의 동작

### 데이터 삽입

### 데이터 삭제

힙 자료구조의 목표는 바로 최대값이나 최소값을 알아내는 것이다.

때문에 데이터가 삭제 된다면 최대힙의 경우 가장 큰 값인 부모 노드의 값이 삭제된다.

![image.png](attachment:effbaafe-2208-4ea0-9c86-c93e7e64417d:image.png)

- 부모 노드가 비었으므로, 가장 최하단부 노드를 루트로 옮긴다.부모 노드인 8보다 값이 큰 자식 노드가 있는지 비교한다.
    - 왼쪽, 오른쪽 자식 노드 모두 부모 노드보다 클 경우왼쪽 자식 노드와 오른쪽 자식 노드를 비교하여, 더 큰 자식 노드와 부모 노드의 위치를 바꾼다.
    - 왼쪽, 오른쪽 자식 노드 중 하나만 부모 노드보다 클 경우둘 중에 부모 노드보다 큰 자식 노드와 부모 노드의 위치를 바꾼다.

# 구현 방법 - 우선 순위 큐

## 최소 힙

```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
```

이렇게 사용하여 컬렉션에 데이터를 넣으면 remove되는 peek의 값이 minHeap의 최소값이 된다.

- PriorityQueue는 기본적으로 오름차순 정렬이다.
- 숫자가 작을수록 우선순위가 높다.
- poll() peek()을 하면 가장 작은값으로 나온다
- 기본적으로 낮은 숫자부터 큰 숫자 오름차순이다.
- 즉 기본적으로 PriorityQueue는 MIn Heap 구조이다.
- 

## 최대 힙

최대 힙을 사용하는 방법은 Comparator 값을 세팅해주어 사용할 수 있다.

```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -Integer.compare(o1, o2);
    }
});

```

Integer의 compare의 값이 default로 들어가게 되는데 이 값을 -로 바꾸어 주면 Max Heap이 된다.

![image.png](attachment:07a82a62-86f9-476e-afa2-599fa42ce2d9:image.png)

### 맥스 힙 람다식도 가능

PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

```java
//높은 숫자가 우선 순위인 int 형 우선순위 큐 선언
PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
```

## 🎯 정리

| 힙 종류 | 선언 방법 | 우선순위 기준 | 결과 |
| --- | --- | --- | --- |
| Min Heap | `new PriorityQueue<>()` | 작은 수가 먼저 | 가장 작은 값부터 |
| Max Heap | `new PriorityQueue<>(Comparator)` | 큰 수가 먼저 | 가장 큰 값부터 |

## PrioirityQueue

`PriorityQueue`는 **우선순위 큐**로,

항상 **우선순위가 가장 높은 값이 먼저 나오는 큐**입니다.

> 자바에서 PriorityQueue는 내부적으로 힙(Heap) 자료구조를 사용해 구현되어 있습니다.
> 

![image.png](attachment:ceeaf1ff-b2d7-495e-b2e7-4bcd72a589f0:image.png)
