### 📌 **사용 언어** : Java

---
### 📌 **문제 정보**

https://school.programmers.co.kr/learn/courses/30/lessons/42861

<h6 class="guide-section-title" style="box-sizing: border-box; padding: 0px; margin: 0px 0px 1rem; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-variant-alternates: inherit; font-variant-position: inherit; font-variant-emoji: inherit; font-weight: 700; font-stretch: inherit; font-size: 14px; line-height: 1.5; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: white; -webkit-font-smoothing: antialiased; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(38, 55, 71); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;">문제 설명</h6><div class="markdown solarized-dark" style="box-sizing: border-box; padding: 0px; margin: 0px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-variant-alternates: inherit; font-variant-position: inherit; font-variant-emoji: inherit; font-weight: 400; font-stretch: inherit; font-size: 16px; line-height: inherit; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(178, 192, 204); background-color: rgb(38, 55, 71); word-break: normal; overflow-wrap: break-word; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><p style="box-sizing: border-box; padding: 0px; margin: 0px; font-style: inherit; font-variant: inherit; font-weight: 400; font-stretch: inherit; font-size: inherit; line-height: 1.8; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.1px; overflow-wrap: break-word;">n개의 섬 사이에 다리를 건설하는 비용(costs)이 주어질 때, 최소의 비용으로 모든 섬이 서로 통행 가능하도록 만들 때 필요한 최소 비용을 return 하도록 solution을 완성하세요.</p><p style="box-sizing: border-box; padding: 0px; margin: 0.75rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: 400; font-stretch: inherit; font-size: inherit; line-height: 1.8; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.1px; overflow-wrap: break-word;">다리를 여러 번 건너더라도, 도달할 수만 있으면 통행 가능하다고 봅니다. 예를 들어 A 섬과 B 섬 사이에 다리가 있고, B 섬과 C 섬 사이에 다리가 있으면 A 섬과 C 섬은 서로 통행 가능합니다.</p><p style="box-sizing: border-box; padding: 0px; margin: 0.75rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: 400; font-stretch: inherit; font-size: inherit; line-height: 1.8; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.1px; overflow-wrap: break-word;"><strong style="box-sizing: border-box; padding: 0px; margin: 0px; font-style: inherit; font-variant: inherit; font-weight: bolder; font-stretch: inherit; font-size: inherit; line-height: inherit; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; -webkit-font-smoothing: antialiased;">제한사항</strong></p><ul style="box-sizing: border-box; padding: 0px 0px 0px 2.5rem; margin: 1rem 0px 0px; font: inherit; color: inherit;"><li style="box-sizing: border-box; padding: 0px; margin: 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 16px; line-height: 1.6; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.009em; list-style: inherit;">섬의 개수 n은 1 이상 100 이하입니다.</li><li style="box-sizing: border-box; padding: 0px; margin: 0.5rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 16px; line-height: 1.6; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.009em; list-style: inherit;">costs의 길이는<span> </span><code style="box-sizing: border-box; padding: 2px 6px; margin: 0px 2px 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 14px; line-height: inherit; font-family: Hack, Menlo, Monaco, Consolas, &quot;Courier New&quot;, monospace, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(205, 215, 224); overflow-wrap: break-word; border: 1px solid rgb(23, 35, 52); background-color: rgb(32, 43, 61); border-radius: 0.25rem;">((n-1) * n) / 2</code>이하입니다.</li><li style="box-sizing: border-box; padding: 0px; margin: 0.5rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 16px; line-height: 1.6; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.009em; list-style: inherit;">임의의 i에 대해, costs[i][0] 와 costs[i] [1]에는 다리가 연결되는 두 섬의 번호가 들어있고, costs[i] [2]에는 이 두 섬을 연결하는 다리를 건설할 때 드는 비용입니다.</li><li style="box-sizing: border-box; padding: 0px; margin: 0.5rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 16px; line-height: 1.6; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.009em; list-style: inherit;">같은 연결은 두 번 주어지지 않습니다. 또한 순서가 바뀌더라도 같은 연결로 봅니다. 즉 0과 1 사이를 연결하는 비용이 주어졌을 때, 1과 0의 비용이 주어지지 않습니다.</li><li style="box-sizing: border-box; padding: 0px; margin: 0.5rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 16px; line-height: 1.6; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.009em; list-style: inherit;">모든 섬 사이의 다리 건설 비용이 주어지지 않습니다. 이 경우, 두 섬 사이의 건설이 불가능한 것으로 봅니다.</li><li style="box-sizing: border-box; padding: 0px; margin: 0.5rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 16px; line-height: 1.6; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.009em; list-style: inherit;">연결할 수 없는 섬은 주어지지 않습니다.</li></ul><p style="box-sizing: border-box; padding: 0px; margin: 0.75rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: 400; font-stretch: inherit; font-size: inherit; line-height: 1.8; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.1px; overflow-wrap: break-word;"><strong style="box-sizing: border-box; padding: 0px; margin: 0px; font-style: inherit; font-variant: inherit; font-weight: bolder; font-stretch: inherit; font-size: inherit; line-height: inherit; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; -webkit-font-smoothing: antialiased;">입출력 예</strong></p>
n | costs | return
-- | -- | --
4 | [[0,1,1],[0,2,2],[1,2,5],[1,3,1],[2,3,8]] | 4

<p style="box-sizing: border-box; padding: 0px; margin: 0.75rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: 400; font-stretch: inherit; font-size: inherit; line-height: 1.8; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.1px; overflow-wrap: break-word;"><strong style="box-sizing: border-box; padding: 0px; margin: 0px; font-style: inherit; font-variant: inherit; font-weight: bolder; font-stretch: inherit; font-size: inherit; line-height: inherit; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; -webkit-font-smoothing: antialiased;">입출력 예 설명</strong></p><p style="box-sizing: border-box; padding: 0px; margin: 0.75rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: 400; font-stretch: inherit; font-size: inherit; line-height: 1.8; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.1px; overflow-wrap: break-word;">costs를 그림으로 표현하면 다음과 같으며, 이때 초록색 경로로 연결하는 것이 가장 적은 비용으로 모두를 통행할 수 있도록 만드는 방법입니다.</p><p style="box-sizing: border-box; padding: 0px; margin: 0.75rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: 400; font-stretch: inherit; font-size: inherit; line-height: 1.8; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.1px; overflow-wrap: break-word;"><img src="https://grepp-programmers.s3.amazonaws.com/files/production/13e2952057/f2746a8c-527c-4451-9a73-42129911fe17.png" title="" alt="image.png" style="box-sizing: border-box; padding: 0px; margin: 0px; font: inherit; color: inherit; vertical-align: middle; border-style: none; max-width: 100%; border-radius: 0.25rem;"></p></div>
---

### 📌 **소스 코드 (성공 사례)**

```java
java

package BOSEONG.WEEK9.BOSEONG;

import java.util.*;
public class BS_섬연결하기 {


class Solution {
    public int solution(int n, int[][] costs) {
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();

        // 그래프 만들 때 비용도 추가로 넣어주기
        for (int[] c : costs) {
            graph[c[0]].add(new int[]{c[1], c[2]});
            graph[c[1]].add(new int[]{c[0], c[2]});
        }

        boolean[] visited = new boolean[n];
        // 우선 순위 써서 비용 순서대로 나열하도록 하기
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{0, 0}); // {정점, 비용}

        int total = 0;
        int count = 0;

        // 비어있거나 다리 놓는 갯수 넘어가면 멈추게 하고
        while (!pq.isEmpty() && count < n) {
            int[] cur = pq.poll();
            int node = cur[0];
            int cost = cur[1];

            // 이미 값 있으면 넘어가도록 함
            // 차피 우선순위 큐 써서 작은 수 먼저나오기 때문에
            if (visited[node]) continue;

            // 그게 아니면 값 더해주기
            visited[node] = true;
            total += cost;
            count++;

            for (int[] next : graph[node]) {
                if (!visited[next[0]]) {
                    pq.offer(next);
                }
            }
        }

        return total;
    }
}
}

```

---
### 📌 **메모리 & 소요 시간**



---
### 📌 **시간 복잡도**

-  O(E log E)
	•	시간복잡도: O(E log E) 또는 O(E log V)로 설명 가능
	•	여기서 E는 간선의 수, V는 정점 수 (n)
	•	costs 배열이 이미 주어진 간선 리스트라서, E = costs.length
---

### 📌 **알고리즘 설명**

- 구할 떈 몰랐는데 이게 Prim 이더라구요
- 일단 그래프에다가 내 현재 점을 기준으로 { 이동할 점, 비용}
- 저는 우선순위큐를 써서 이동할 점에 대해서 비용이 들어가게 끔 했음
- 그렇게 처음 방문한 것이 아닌 곳부터 이동하도록 해서 최솟값들을 더하고 다리 세운 갯수가 섬이랑 같아지면 안되는 조건으로 while문
- 그렇게 종료하면 끝

---


### 📌 **얻어갈 점**

✅ **명확한 조건식 설계의 중요성**

- graph가 익숙해지니까 이런 문제 보는 시야가 넓어진 느낌
- 비용까지 담아서 우선순위 큐 활용에 대해서 배우는 기회가 됨
---
