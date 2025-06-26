### 📌 **사용 언어** : Java

---
### 📌 **문제 정보**
https://school.programmers.co.kr/learn/courses/30/lessons/1835

<h2 style="box-sizing: border-box; padding: 0px; margin: 0px 0px 0.25rem; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-variant-alternates: inherit; font-variant-position: inherit; font-variant-emoji: inherit; font-weight: 700; font-stretch: inherit; font-size: 26px; line-height: 1.4; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: white; letter-spacing: -0.009em; -webkit-font-smoothing: antialiased; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(38, 55, 71); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;">단체사진 찍기</h2><p style="box-sizing: border-box; padding: 0px; margin: 0.75rem 0px 0px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-variant-alternates: inherit; font-variant-position: inherit; font-variant-emoji: inherit; font-weight: 400; font-stretch: inherit; font-size: 16px; line-height: 1.8; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(178, 192, 204); letter-spacing: -0.1px; overflow-wrap: break-word; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(38, 55, 71); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><img src="https://t1.kakaocdn.net/codefestival/picture.png" title="" alt="picture" style="box-sizing: border-box; padding: 0px; margin: 0px; font: inherit; color: inherit; vertical-align: middle; border-style: none; max-width: 100%; border-radius: 0.25rem;"></p><p style="box-sizing: border-box; padding: 0px; margin: 0.75rem 0px 0px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-variant-alternates: inherit; font-variant-position: inherit; font-variant-emoji: inherit; font-weight: 400; font-stretch: inherit; font-size: 16px; line-height: 1.8; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(178, 192, 204); letter-spacing: -0.1px; overflow-wrap: break-word; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(38, 55, 71); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;">가을을 맞아 카카오프렌즈는 단체로 소풍을 떠났다. 즐거운 시간을 보내고 마지막에 단체사진을 찍기 위해 카메라 앞에 일렬로 나란히 섰다. 그런데 각자가 원하는 배치가 모두 달라 어떤 순서로 설지 정하는데 시간이 오래 걸렸다. 네오는 프로도와 나란히 서기를 원했고, 튜브가 뿜은 불을 맞은 적이 있던 라이언은 튜브에게서 적어도 세 칸 이상 떨어져서 서기를 원했다. 사진을 찍고 나서 돌아오는 길에, 무지는 모두가 원하는 조건을 만족하면서도 다르게 서는 방법이 있지 않았을까 생각해보게 되었다. 각 프렌즈가 원하는 조건을 입력으로 받았을 때 모든 조건을 만족할 수 있도록 서는 경우의 수를 계산하는 프로그램을 작성해보자.</p><h3 style="box-sizing: border-box; padding: 0px; margin: 2.5rem 0px 0px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-variant-alternates: inherit; font-variant-position: inherit; font-variant-emoji: inherit; font-weight: 700; font-stretch: inherit; font-size: 20px; line-height: 1.6; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: white; letter-spacing: -0.009em; -webkit-font-smoothing: antialiased; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(38, 55, 71); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;">입력 형식</h3><p style="box-sizing: border-box; padding: 0px; margin: 0.75rem 0px 0px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-variant-alternates: inherit; font-variant-position: inherit; font-variant-emoji: inherit; font-weight: 400; font-stretch: inherit; font-size: 16px; line-height: 1.8; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(178, 192, 204); letter-spacing: -0.1px; overflow-wrap: break-word; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(38, 55, 71); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;">입력은 조건의 개수를 나타내는 정수<span> </span><code style="box-sizing: border-box; padding: 2px 6px; margin: 0px 2px 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 14px; line-height: inherit; font-family: Hack, Menlo, Monaco, Consolas, &quot;Courier New&quot;, monospace, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(205, 215, 224); overflow-wrap: break-word; border: 1px solid rgb(23, 35, 52); background-color: rgb(32, 43, 61); border-radius: 0.25rem;">n</code>과<span> </span><code style="box-sizing: border-box; padding: 2px 6px; margin: 0px 2px 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 14px; line-height: inherit; font-family: Hack, Menlo, Monaco, Consolas, &quot;Courier New&quot;, monospace, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(205, 215, 224); overflow-wrap: break-word; border: 1px solid rgb(23, 35, 52); background-color: rgb(32, 43, 61); border-radius: 0.25rem;">n</code>개의 원소로 구성된 문자열 배열<span> </span><code style="box-sizing: border-box; padding: 2px 6px; margin: 0px 2px 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 14px; line-height: inherit; font-family: Hack, Menlo, Monaco, Consolas, &quot;Courier New&quot;, monospace, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(205, 215, 224); overflow-wrap: break-word; border: 1px solid rgb(23, 35, 52); background-color: rgb(32, 43, 61); border-radius: 0.25rem;">data</code>로 주어진다.<span> </span><code style="box-sizing: border-box; padding: 2px 6px; margin: 0px 2px 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 14px; line-height: inherit; font-family: Hack, Menlo, Monaco, Consolas, &quot;Courier New&quot;, monospace, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(205, 215, 224); overflow-wrap: break-word; border: 1px solid rgb(23, 35, 52); background-color: rgb(32, 43, 61); border-radius: 0.25rem;">data</code>의 원소는 각 프렌즈가 원하는 조건이<span> </span><code style="box-sizing: border-box; padding: 2px 6px; margin: 0px 2px 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 14px; line-height: inherit; font-family: Hack, Menlo, Monaco, Consolas, &quot;Courier New&quot;, monospace, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(205, 215, 224); overflow-wrap: break-word; border: 1px solid rgb(23, 35, 52); background-color: rgb(32, 43, 61); border-radius: 0.25rem;">N~F=0</code>과 같은 형태의 문자열로 구성되어 있다. 제한조건은 아래와 같다.</p><ul style="box-sizing: border-box; padding: 0px 0px 0px 2.5rem; margin: 1rem 0px 0px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-variant-alternates: inherit; font-variant-position: inherit; font-variant-emoji: inherit; font-weight: 400; font-stretch: inherit; font-size: 16px; line-height: inherit; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(178, 192, 204); letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(38, 55, 71); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><li style="box-sizing: border-box; padding: 0px; margin: 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 16px; line-height: 1.6; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.009em; list-style: inherit;"><code style="box-sizing: border-box; padding: 2px 6px; margin: 0px 2px 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 14px; line-height: inherit; font-family: Hack, Menlo, Monaco, Consolas, &quot;Courier New&quot;, monospace, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(205, 215, 224); overflow-wrap: break-word; border: 1px solid rgb(23, 35, 52); background-color: rgb(32, 43, 61); border-radius: 0.25rem;">1 &lt;= n &lt;= 100</code></li><li style="box-sizing: border-box; padding: 0px; margin: 0.5rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 16px; line-height: 1.6; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.009em; list-style: inherit;"><code style="box-sizing: border-box; padding: 2px 6px; margin: 0px 2px 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 14px; line-height: inherit; font-family: Hack, Menlo, Monaco, Consolas, &quot;Courier New&quot;, monospace, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(205, 215, 224); overflow-wrap: break-word; border: 1px solid rgb(23, 35, 52); background-color: rgb(32, 43, 61); border-radius: 0.25rem;">data</code>의 원소는 다섯 글자로 구성된 문자열이다. 각 원소의 조건은 다음과 같다.<ul style="box-sizing: border-box; padding: 0px 0px 0px 2.5rem; margin: 0.75rem 0px 0px; font: inherit; color: inherit;"><li style="box-sizing: border-box; padding: 0px; margin: 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 16px; line-height: 1.6; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.009em; list-style: inherit;">첫 번째 글자와 세 번째 글자는 다음 8개 중 하나이다.<span> </span><code style="box-sizing: border-box; padding: 2px 6px; margin: 0px 2px 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 14px; line-height: inherit; font-family: Hack, Menlo, Monaco, Consolas, &quot;Courier New&quot;, monospace, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(205, 215, 224); overflow-wrap: break-word; border: 1px solid rgb(23, 35, 52); background-color: rgb(32, 43, 61); border-radius: 0.25rem;">{A, C, F, J, M, N, R, T}</code><span> </span>각각 어피치, 콘, 프로도, 제이지, 무지, 네오, 라이언, 튜브를 의미한다. 첫 번째 글자는 조건을 제시한 프렌즈, 세 번째 글자는 상대방이다. 첫 번째 글자와 세 번째 글자는 항상 다르다.</li><li style="box-sizing: border-box; padding: 0px; margin: 0.5rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 16px; line-height: 1.6; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.009em; list-style: inherit;">두 번째 글자는 항상<span> </span><code style="box-sizing: border-box; padding: 2px 6px; margin: 0px 2px 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 14px; line-height: inherit; font-family: Hack, Menlo, Monaco, Consolas, &quot;Courier New&quot;, monospace, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(205, 215, 224); overflow-wrap: break-word; border: 1px solid rgb(23, 35, 52); background-color: rgb(32, 43, 61); border-radius: 0.25rem;">~</code>이다.</li><li style="box-sizing: border-box; padding: 0px; margin: 0.5rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 16px; line-height: 1.6; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.009em; list-style: inherit;">네 번째 글자는 다음 3개 중 하나이다.<span> </span><code style="box-sizing: border-box; padding: 2px 6px; margin: 0px 2px 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 14px; line-height: inherit; font-family: Hack, Menlo, Monaco, Consolas, &quot;Courier New&quot;, monospace, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(205, 215, 224); overflow-wrap: break-word; border: 1px solid rgb(23, 35, 52); background-color: rgb(32, 43, 61); border-radius: 0.25rem;">{=, &lt;, &gt;}</code><span> </span>각각 같음, 미만, 초과를 의미한다.</li><li style="box-sizing: border-box; padding: 0px; margin: 0.5rem 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 16px; line-height: 1.6; font-family: inherit; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: inherit; letter-spacing: -0.009em; list-style: inherit;">다섯 번째 글자는<span> </span><code style="box-sizing: border-box; padding: 2px 6px; margin: 0px 2px 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 14px; line-height: inherit; font-family: Hack, Menlo, Monaco, Consolas, &quot;Courier New&quot;, monospace, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(205, 215, 224); overflow-wrap: break-word; border: 1px solid rgb(23, 35, 52); background-color: rgb(32, 43, 61); border-radius: 0.25rem;">0</code><span> </span>이상<span> </span><code style="box-sizing: border-box; padding: 2px 6px; margin: 0px 2px 0px 0px; font-style: inherit; font-variant: inherit; font-weight: inherit; font-stretch: inherit; font-size: 14px; line-height: inherit; font-family: Hack, Menlo, Monaco, Consolas, &quot;Courier New&quot;, monospace, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(205, 215, 224); overflow-wrap: break-word; border: 1px solid rgb(23, 35, 52); background-color: rgb(32, 43, 61); border-radius: 0.25rem;">6</code><span> </span>이하의 정수의 문자형이며, 조건에 제시되는 간격을 의미한다. 이때 간격은 두 프렌즈 사이에 있는 다른 프렌즈의 수이다.</li></ul></li></ul><h3 style="box-sizing: border-box; padding: 0px; margin: 2.5rem 0px 0px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-variant-alternates: inherit; font-variant-position: inherit; font-variant-emoji: inherit; font-weight: 700; font-stretch: inherit; font-size: 20px; line-height: 1.6; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: white; letter-spacing: -0.009em; -webkit-font-smoothing: antialiased; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(38, 55, 71); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;">출력 형식</h3><p style="box-sizing: border-box; padding: 0px; margin: 0.75rem 0px 0px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-variant-alternates: inherit; font-variant-position: inherit; font-variant-emoji: inherit; font-weight: 400; font-stretch: inherit; font-size: 16px; line-height: 1.8; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(178, 192, 204); letter-spacing: -0.1px; overflow-wrap: break-word; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(38, 55, 71); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;">모든 조건을 만족하는 경우의 수를 리턴한다.</p><h3 style="box-sizing: border-box; padding: 0px; margin: 2.5rem 0px 0px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-variant-alternates: inherit; font-variant-position: inherit; font-variant-emoji: inherit; font-weight: 700; font-stretch: inherit; font-size: 20px; line-height: 1.6; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: white; letter-spacing: -0.009em; -webkit-font-smoothing: antialiased; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(38, 55, 71); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;">예제 입출력</h3>
n | data | answer
-- | -- | --
2 | ["N~F=0", "R~T>2"] | 3648
2 | ["M~C<2", "C~M>1"] | 0

<h3 style="box-sizing: border-box; padding: 0px; margin: 2.5rem 0px 0px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-variant-alternates: inherit; font-variant-position: inherit; font-variant-emoji: inherit; font-weight: 700; font-stretch: inherit; font-size: 20px; line-height: 1.6; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: white; letter-spacing: -0.009em; -webkit-font-smoothing: antialiased; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(38, 55, 71); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;">예제에 대한 설명</h3><p style="box-sizing: border-box; padding: 0px; margin: 0.75rem 0px 0px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-variant-alternates: inherit; font-variant-position: inherit; font-variant-emoji: inherit; font-weight: 400; font-stretch: inherit; font-size: 16px; line-height: 1.8; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(178, 192, 204); letter-spacing: -0.1px; overflow-wrap: break-word; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(38, 55, 71); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;">첫 번째 예제는 문제에 설명된 바와 같이, 네오는 프로도와의 간격이 0이기를 원하고 라이언은 튜브와의 간격이 2보다 크기를 원하는 상황이다.</p><p style="box-sizing: border-box; padding: 0px; margin: 0.75rem 0px 0px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-variant-alternates: inherit; font-variant-position: inherit; font-variant-emoji: inherit; font-weight: 400; font-stretch: inherit; font-size: 16px; line-height: 1.8; font-family: Inter, NotoSansKR, &quot;Helvetica Neue&quot;, Helvetica, Arial, &quot;맑은 고딕&quot;, &quot;malgun gothic&quot;, 돋움, Dotum, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Noto Color Emoji&quot;; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(178, 192, 204); letter-spacing: -0.1px; overflow-wrap: break-word; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(38, 55, 71); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;">두 번째 예제는 무지가 콘과의 간격이 2보다 작기를 원하고, 반대로 콘은 무지와의 간격이 1보다 크기를 원하는 상황이다. 이는 동시에 만족할 수 없는 조건이므로 경우의 수는 0이다.</p>

---

### 📌 **소스 코드 (성공 사례)**

```import java.util.*;

class Solution {
static String[] friends = {"A", "C", "F", "J", "M", "N", "R", "T"};
    static boolean[] visited = new boolean[8];
    static String[] current = new String[8];
    static int answer = 0;

    public static int solution(int n, String[] data) {
        answer = 0;
        dfs(0, data);
        return answer;
    }

    // 순열 생성
    static void dfs(int depth, String[] data) {
        if (depth == 8) {
            if (isValid(data)) answer++;
            return;
        }
       // 완탐이니까 visited 지나가면 다시 풀어줘야함
        for (int i = 0; i < 8; i++) {
            if (!visited[i]) {
                visited[i] = true;
                current[depth] = friends[i];
                dfs(depth + 1, data);
                visited[i] = false;
            }
        }
    }

    // 조건 검사
    static boolean isValid(String[] data) {
        Map<String, Integer> pos = new HashMap<>();
        for (int i = 0; i < 8; i++) {
            pos.put(current[i], i);
        }
       // 문자열 위치 보고 수식 적을려고 빼는거임
        for (String cond : data) {
            String a = cond.charAt(0) + "";
            String b = cond.charAt(2) + "";
            char op = cond.charAt(3);
            int dist = cond.charAt(4) - '0';

            int gap = Math.abs(pos.get(a) - pos.get(b)) - 1;

            if (op == '=') {
                if (gap != dist) return false;
            } else if (op == '<') {
                if (gap >= dist) return false;
            } else if (op == '>') {
                if (gap <= dist) return false;
            }
        }

        return true;
    }
}

```

---
### 📌 **메모리 & 소요 시간**


![image](https://github.com/user-attachments/assets/a9a6d5c0-d81b-4d1e-9902-c2779c36ead1)



---
### 📌 **시간 복잡도**

조건 검사 비용 O(n), 최대 100
순열의 수 × 조건 검사 시간 = O(8!) × O(n)
전체 시간복잡도
O(40320 × 100) = 약 400만 회

---

### 📌 **알고리즘 설명**

{"A", "C", "F", "J", "M", "N", "R", "T"}; 문자 8개를 나열 했을 때 주어진 조건에 맞는 개수
그래서 모든 경우의 수를 만들고 8개가 다 완성 했을 때 당시 조건이 맞다면 횟수 + 1
생각보다 간단한 문제

---

### 📌 **얻어갈 점**

✅ **명확한 조건식 설계의 중요성**

- dfs를 더 활용하는 방식에 여러가지가 있는거 같음
- visited를 잘 활용해서 완전 탐색 할 수 있게끔 설정해 주고 조건식 잘 구현 할 것

---

### 📌 **사용 언어** : Java

---
### 📌 **문제 정보**

https://www.acmicpc.net/problem/17779

<div class="col-md-12" style="box-sizing: border-box; border-radius: 0px !important; position: relative; min-height: 1px; padding-right: 15px; padding-left: 15px;"><div class="page-header" style="box-sizing: border-box; border-radius: 0px !important; padding-bottom: 9px; margin: 40px 0px 20px; border-bottom: 1px solid rgb(238, 238, 238);"><h1 style="box-sizing: border-box; border-radius: 0px !important; margin: 5px 0px 10px; font-size: 28px; font-family: &quot;Open Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Apple SD Gothic Neo&quot;, &quot;Noto Sans CJK KR&quot;, &quot;Noto Sans KR&quot;, 나눔바른고딕, 나눔고딕, 맑은고딕, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot; !important; font-weight: normal; line-height: 35px; color: rgb(88, 95, 105); text-shadow: none;"><span id="problem_title" style="box-sizing: border-box; border-radius: 0px !important;">게리맨더링 2</span><div class="btn-group pull-right problem-button" style="box-sizing: border-box; border-radius: 0px !important; position: relative; display: inline-block; vertical-align: middle; float: right;"><button class="btn btn-default" type="button" id="favorite_button" data-favorite="0" style="box-sizing: border-box; border-radius: 4px; margin: 0px; font-style: inherit; font-variant: inherit; font-weight: 400; font-stretch: inherit; font-size: 14px; line-height: 1.42857; font-family: &quot;Open Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Apple SD Gothic Neo&quot;, &quot;Noto Sans CJK KR&quot;, &quot;Noto Sans KR&quot;, 나눔바른고딕, 나눔고딕, 맑은고딕, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot; !important; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(51, 51, 51); overflow: visible; text-transform: none; appearance: button; cursor: pointer; outline: 0px !important; display: inline-block; padding: 6px 12px; text-align: center; white-space: nowrap; vertical-align: middle; user-select: none; background-image: none; border: 1px solid rgb(204, 204, 204); background-color: rgb(255, 255, 255); box-shadow: none; position: relative; float: left;"><span class="glyphicon glyphicon-star-empty" id="favorite_image" style="box-sizing: border-box; border-radius: 0px !important; position: relative; top: 1px; display: inline-block; font-family: &quot;Glyphicons Halflings&quot;; font-style: normal; font-weight: 400; line-height: 1; -webkit-font-smoothing: antialiased;"></span></button></div></h1></div></div><div class="col-md-12" style="box-sizing: border-box; border-radius: 0px !important; position: relative; min-height: 1px; padding-right: 15px; padding-left: 15px;"><div class="table-responsive" style="box-sizing: border-box; border-radius: 0px !important; width: 642px; margin-bottom: 15px; overflow: auto hidden; border: 1px solid rgb(221, 221, 221);">
시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율
-- | -- | -- | -- | -- | --
1 초 | 512 MB | 15445 | 5311 | 3565 | 49.541%

<p style="box-sizing: border-box; border-radius: 0px !important; margin: 0px 0px 10px; color: rgb(85, 85, 85);">구역 (r, c)의 인구는 A[r][c]이고, 선거구의 인구는 선거구에 포함된 구역의 인구를 모두 합한 값이다. 선거구를 나누는 방법 중에서, 인구가 가장 많은 선거구와 가장 적은 선거구의 인구 차이의 최솟값을 구해보자.</p></div></section></div><div class="col-md-12" style="box-sizing: border-box; border-radius: 0px !important; position: relative; min-height: 1px; padding-right: 15px; padding-left: 15px;"><section id="input" class="problem-section" style="box-sizing: border-box; border-radius: 0px !important; display: block;"><div class="headline" style="box-sizing: border-box; border-radius: 0px !important; display: block; margin: 10px 0px 25px; border-bottom: 1px dotted rgb(228, 233, 240);"><h2 style="box-sizing: border-box; border-radius: 0px !important; font-family: &quot;Open Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Apple SD Gothic Neo&quot;, &quot;Noto Sans CJK KR&quot;, &quot;Noto Sans KR&quot;, 나눔바른고딕, 나눔고딕, 맑은고딕, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot; !important; font-weight: normal; line-height: 33px; color: rgb(88, 95, 105); margin: 0px 0px -2px; font-size: 22px; text-shadow: none; padding-bottom: 5px; display: inline-block; border-bottom: 2px solid rgb(0, 118, 192);">입력</h2></div><div id="problem_input" class="problem-text" style="box-sizing: border-box; border-radius: 0px !important; font-size: medium; line-height: 30px;"><p style="box-sizing: border-box; border-radius: 0px !important; margin: 0px 0px 10px; color: rgb(85, 85, 85);">첫째 줄에 재현시의 크기 N이 주어진다.</p><p style="box-sizing: border-box; border-radius: 0px !important; margin: 0px 0px 10px; color: rgb(85, 85, 85);">둘째 줄부터 N개의 줄에 N개의 정수가 주어진다. r행 c열의 정수는 A[r][c]를 의미한다.</p></div></section></div><div class="col-md-12" style="box-sizing: border-box; border-radius: 0px !important; position: relative; min-height: 1px; padding-right: 15px; padding-left: 15px;"><section id="output" class="problem-section" style="box-sizing: border-box; border-radius: 0px !important; display: block;"><div class="headline" style="box-sizing: border-box; border-radius: 0px !important; display: block; margin: 10px 0px 25px; border-bottom: 1px dotted rgb(228, 233, 240);"><h2 style="box-sizing: border-box; border-radius: 0px !important; font-family: &quot;Open Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Apple SD Gothic Neo&quot;, &quot;Noto Sans CJK KR&quot;, &quot;Noto Sans KR&quot;, 나눔바른고딕, 나눔고딕, 맑은고딕, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot; !important; font-weight: normal; line-height: 33px; color: rgb(88, 95, 105); margin: 0px 0px -2px; font-size: 22px; text-shadow: none; padding-bottom: 5px; display: inline-block; border-bottom: 2px solid rgb(0, 118, 192);">출력</h2></div><div id="problem_output" class="problem-text" style="box-sizing: border-box; border-radius: 0px !important; font-size: medium; line-height: 30px;"><p style="box-sizing: border-box; border-radius: 0px !important; margin: 0px 0px 10px; color: rgb(85, 85, 85);">첫째 줄에 인구가 가장 많은 선거구와 가장 적은 선거구의 인구 차이의 최솟값을 출력한다.</p></div></section></div><div class="col-md-12" style="box-sizing: border-box; border-radius: 0px !important; position: relative; min-height: 1px; padding-right: 15px; padding-left: 15px;"><section id="limit" class="problem-section" style="box-sizing: border-box; border-radius: 0px !important; display: block;"><div class="headline" style="box-sizing: border-box; border-radius: 0px !important; display: block; margin: 10px 0px 25px; border-bottom: 1px dotted rgb(228, 233, 240);"><h2 style="box-sizing: border-box; border-radius: 0px !important; font-family: &quot;Open Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Apple SD Gothic Neo&quot;, &quot;Noto Sans CJK KR&quot;, &quot;Noto Sans KR&quot;, 나눔바른고딕, 나눔고딕, 맑은고딕, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot; !important; font-weight: normal; line-height: 33px; color: rgb(88, 95, 105); margin: 0px 0px -2px; font-size: 22px; text-shadow: none; padding-bottom: 5px; display: inline-block; border-bottom: 2px solid rgb(0, 118, 192);">제한</h2></div><div id="problem_limit" class="problem-text" style="box-sizing: border-box; border-radius: 0px !important; font-size: medium; line-height: 30px;"><ul style="box-sizing: border-box; border-radius: 0px !important; margin-top: 0px; margin-bottom: 10px;"><li style="box-sizing: border-box; border-radius: 0px !important; color: rgb(85, 85, 85);">5 ≤ N ≤ 20</li><li style="box-sizing: border-box; border-radius: 0px !important; color: rgb(85, 85, 85);">1 ≤ A[r][c] ≤ 100</li></ul></div></section></div><div class="col-md-12" style="box-sizing: border-box; border-radius: 0px !important; position: relative; min-height: 1px; padding-right: 15px; padding-left: 15px;"><div class="row" style="box-sizing: border-box; border-radius: 0px !important; margin-right: -15px; margin-left: -15px;"><div class="col-md-6" style="box-sizing: border-box; border-radius: 0px !important; position: relative; min-height: 1px; padding-right: 15px; padding-left: 15px; color: rgb(51, 51, 51); font-family: &quot;Open Sans&quot;, -apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, &quot;Apple SD Gothic Neo&quot;, &quot;Noto Sans CJK KR&quot;, &quot;Noto Sans KR&quot;, 나눔바른고딕, 나눔고딕, 맑은고딕, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;; font-size: 13px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(255, 255, 255); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><section id="sampleinput1" style="box-sizing: border-box; border-radius: 0px !important; display: block;"><div class="headline" style="box-sizing: border-box; border-radius: 0px !important; display: block; margin: 10px 0px 25px; border-bottom: 1px dotted rgb(228, 233, 240);"><h2 style="box-sizing: border-box; border-radius: 0px !important; font-family: &quot;Open Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Apple SD Gothic Neo&quot;, &quot;Noto Sans CJK KR&quot;, &quot;Noto Sans KR&quot;, 나눔바른고딕, 나눔고딕, 맑은고딕, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot; !important; font-weight: normal; line-height: 33px; color: rgb(88, 95, 105); margin: 0px 0px -2px; font-size: 22px; text-shadow: none; padding-bottom: 5px; display: inline-block; border-bottom: 2px solid rgb(0, 118, 192);">예제 입력 1<span> </span><button type="button" class="btn btn-link copy-button" data-clipboard-target="#sample-input-1" style="box-sizing: border-box; border-radius: 0px; margin: 0px; font-style: inherit; font-variant: inherit; font-weight: 400; font-stretch: inherit; font-size: 14px; line-height: 1.42857; font-family: &quot;Open Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Apple SD Gothic Neo&quot;, &quot;Noto Sans CJK KR&quot;, &quot;Noto Sans KR&quot;, 나눔바른고딕, 나눔고딕, 맑은고딕, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot; !important; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(66, 139, 202); overflow: visible; text-transform: none; appearance: button; cursor: pointer; outline: 0px !important; display: inline-block; padding: 0px; text-align: center; white-space: nowrap; vertical-align: middle; user-select: none; background-image: none; border: 1px solid transparent; background-color: transparent; box-shadow: none;">복사</button></h2></div><pre class="sampledata" id="sample-input-1" style="box-sizing: border-box; border-radius: 5px; overflow: scroll auto; font-family: Menlo, Monaco, &quot;Source Code Pro&quot;, consolas, monospace; font-size: 18px; display: block; padding: 8px; margin: 0px 0px 10px; line-height: 1.42857; color: rgb(51, 51, 51); word-break: normal; overflow-wrap: normal; background-color: rgb(247, 247, 249); border: 1px solid rgb(225, 225, 232); white-space: pre;">6
1 2 3 4 1 6
7 8 9 1 4 2
2 3 4 1 1 3
6 6 6 6 9 4
9 1 9 1 9 5
1 1 1 1 9 9
</pre></section></div><div class="col-md-6" style="box-sizing: border-box; border-radius: 0px !important; position: relative; min-height: 1px; padding-right: 15px; padding-left: 15px; color: rgb(51, 51, 51); font-family: &quot;Open Sans&quot;, -apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, &quot;Apple SD Gothic Neo&quot;, &quot;Noto Sans CJK KR&quot;, &quot;Noto Sans KR&quot;, 나눔바른고딕, 나눔고딕, 맑은고딕, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;; font-size: 13px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(255, 255, 255); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><section id="sampleoutput1" style="box-sizing: border-box; border-radius: 0px !important; display: block;"><div class="headline" style="box-sizing: border-box; border-radius: 0px !important; display: block; margin: 10px 0px 25px; border-bottom: 1px dotted rgb(228, 233, 240);"><h2 style="box-sizing: border-box; border-radius: 0px !important; font-family: &quot;Open Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Apple SD Gothic Neo&quot;, &quot;Noto Sans CJK KR&quot;, &quot;Noto Sans KR&quot;, 나눔바른고딕, 나눔고딕, 맑은고딕, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot; !important; font-weight: normal; line-height: 33px; color: rgb(88, 95, 105); margin: 0px 0px -2px; font-size: 22px; text-shadow: none; padding-bottom: 5px; display: inline-block; border-bottom: 2px solid rgb(0, 118, 192);">예제 출력 1<span> </span><button type="button" class="btn btn-link copy-button" data-clipboard-target="#sample-output-1" style="box-sizing: border-box; border-radius: 0px; margin: 0px; font-style: inherit; font-variant: inherit; font-weight: 400; font-stretch: inherit; font-size: 14px; line-height: 1.42857; font-family: &quot;Open Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Apple SD Gothic Neo&quot;, &quot;Noto Sans CJK KR&quot;, &quot;Noto Sans KR&quot;, 나눔바른고딕, 나눔고딕, 맑은고딕, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot; !important; font-optical-sizing: inherit; font-size-adjust: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; color: rgb(66, 139, 202); overflow: visible; text-transform: none; appearance: button; cursor: pointer; outline: 0px !important; display: inline-block; padding: 0px; text-align: center; white-space: nowrap; vertical-align: middle; user-select: none; background-image: none; border: 1px solid transparent; background-color: transparent; box-shadow: none;">복사</button></h2></div><pre class="sampledata" id="sample-output-1" style="box-sizing: border-box; border-radius: 5px; overflow: scroll auto; font-family: Menlo, Monaco, &quot;Source Code Pro&quot;, consolas, monospace; font-size: 18px; display: block; padding: 8px; margin: 0px 0px 10px; line-height: 1.42857; color: rgb(51, 51, 51); word-break: normal; overflow-wrap: normal; background-color: rgb(247, 247, 249); border: 1px solid rgb(225, 225, 232); white-space: pre;">18
</pre></section></div><div class="col-md-12" style="box-sizing: border-box; border-radius: 0px !important; position: relative; min-height: 1px; padding-right: 15px; padding-left: 15px; color: rgb(51, 51, 51); font-family: &quot;Open Sans&quot;, -apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, &quot;Apple SD Gothic Neo&quot;, &quot;Noto Sans CJK KR&quot;, &quot;Noto Sans KR&quot;, 나눔바른고딕, 나눔고딕, 맑은고딕, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;; font-size: 13px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; background-color: rgb(255, 255, 255); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><section id="sample_explain_1" class="problem-section" style="box-sizing: border-box; border-radius: 0px !important; display: block;"><div id="problem_sample_explain_1" class="problem-text" style="box-sizing: border-box; border-radius: 0px !important; font-size: medium; line-height: 30px;"><br class="Apple-interchange-newline">
---

### 📌 소스 코드 (성공 사례) - 답지 참고 ㅠ

```
package BOSEONG.WEEK10.BOSEONG;

import java.io.*;
import java.util.*;

public class BS_17779 {
    static int N;
    static int[][] A;
    static int totalPeople = 0;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        A = new int[N][N];

        // 여기에 이제 인구수 담는거임
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
                totalPeople += A[i][j];
            }
        }

        // 모든 가능한 (x, y, d1, d2) 완전 탐색
        // 범위는 주어진거 그대로 사용하면 됨
        // d1, d2 ≥ 1, 1 ≤ x < x+d1+d2 ≤ N, 1 ≤ y-d1 < y < y+d2 ≤ N
        // 조건 보면 x,y,d1,d2 다 1이상 시작하면 됨 ㅇㅇ
        // x+d1+d2 는 일단 N 보다 크면 안됨
        // y도 y + d2도 N보다 크면 안됨
        // y-d1 한 것도 1보다 커야함
        // 이제 다 거르고 걸러서 Dfs 하면 됨
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                for (int d1 = 1; d1 < N; d1++) {
                    for (int d2 = 1; d2 < N; d2++) {
                        if (x + d1 + d2 >= N) continue;
                        if (y - d1 < 0 || y + d2 >= N) continue;

                        dfs(x, y, d1, d2);
                    }
                }
            }
        }

        System.out.println(min);
    }

    static void dfs(int x, int y, int d1, int d2) {
        // 이걸로 이제 1,2,3,4,5 위치 나눠서
        // 값 넣은 다음에 채우기 할거임
        boolean[][] border = new boolean[N][N];

        // 경계선 세팅
        for (int i = 0; i <= d1; i++) {
            border[x + i][y - i] = true;
            border[x + d2 + i][y + d2 - i] = true;
        }

        for (int i = 0; i <= d2; i++) {
            border[x + i][y + i] = true;
            border[x + d1 + i][y - d1 + i] = true;
        }

        // 나머지 구역 1~4번 범위 안에 들어가는 거 채우기
        // 1번 선거구: 1 ≤ r < x+d1, 1 ≤ c ≤ y, 1번 경계선의 왼쪽 위
        // 2번 선거구: 1 ≤ r ≤ x+d2, y < c ≤ N, 2번 경계선의 오른쪽 위
        // 3번 선거구: x+d1 ≤ r ≤ N, 1 ≤ c < y-d1+d2, 3번 경계선의 왼쪽 아래
        // 4번 선거구: x+d2 < r ≤ N, y-d1+d2 ≤ c ≤ N, 4번 경계선의 오른쪽 아래
        // r이랑 c랑 위에 조건 준거 맞춰서 1 이상 처리했고 나머지 조건 맞으면 채워주기
        int[] peopleSum = new int[5];

        // 1 구역 인구수
        for (int i = 0; i < x + d1; i++) {
            for (int j = 0; j <= y; j++) {
                if (border[i][j]) break;
                peopleSum[0] += A[i][j];
            }
        }

        // 2 구역 인구수
        for (int i = 0; i <= x + d2; i++) {
            for (int j = N - 1; j > y; j--) {
                if (border[i][j]) break;
                peopleSum[1] += A[i][j];
            }
        }

        // 3 구역 인구수
        for (int i = x + d1; i < N; i++) {
            for (int j = 0; j < y - d1 + d2; j++) {
                if (border[i][j]) break;
                peopleSum[2] += A[i][j];
            }
        }

        // 4 구역 인구수
        for (int i = x + d2 + 1; i < N; i++) {
            for (int j = N - 1; j >= y - d1 + d2; j--) {
                if (border[i][j]) break;
                peopleSum[3] += A[i][j];
            }
        }

        // 5 구역 인구수 전체에서 나머지 빼주기
        peopleSum[4] = totalPeople;
        for (int i = 0; i < 4; i++) {
            peopleSum[4] -= peopleSum[i];
        }

        // 정렬
        Arrays.sort(peopleSum);

        // 최대 - 최소
        min = Math.min(min, peopleSum[4] - peopleSum[0]);
    }
}

```
---

### 📌 **메모리 & 소요 시간**

<img width="720" alt="image" src="https://github.com/user-attachments/assets/f1f966e1-b848-4000-b3c8-8165c09aecd4" />


---
### 📌 **시간 복잡도**

O(N⁴) 
-> (외부 4중 for문) × O(N²) (solution 내부 계산)

---

### 📌 **알고리즘 설명**

우선 범위에 맞지 않는 부분들을 다 처리하고 dfs 하는 방식
1. 5에 관련된 선거 구역을 먼저 나눈 후 안을 채운다
2. 그 다음 나머지는 조건에 맞게 x,y,d1,d2의 모든 경우에 따라 달라지는 범위를 구함
3. 그렇게 구한 값들로 인구수 최소를 구한 후 비교

---

### 📌 **얻어갈 점**

✅ **명확한 조건식 설계의 중요성**

- 조건 처음에 이해해서 쓰는게 너무 어려웠어요
- 그 다음 채우고 나서도 다 채운 후 어떻게 할지도 고민 많이 하게 되었던거 같아요 ㅠ
- 아직 멀었네요.. ㅠ.ㅠ
---
