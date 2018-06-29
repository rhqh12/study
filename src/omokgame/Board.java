package omokgame;

public class Board {
	int width;
	int height;
	int cnt;
	char[][] buf = new char[height][width];
	
	public Board() {
		this(15,10);
	}
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		buf = new char[height][width];
		
		for (int y = 0; y < height; y++)
			for (int x = 0; x <width; x++)
				buf[y][x] = '╉';
		
	}
	void put(Omok omok) {
		
		int y = omok.omok.get("Y좌표");
		int x = omok.omok.get("X좌표");
		
		if(buf[y][x] == '╉') {
			if(cnt % 2 == 0)
				this.buf[y][x] = '●';
			else
				this.buf[y][x] = 'O';
			cnt++;
		} else {
			System.out.println("이미 바둑알이 있습니다.");
		}
	}
	public void print() {
		for (int y=0; y<height; y++) {
			for (int x=0; x<width; x++) 
				System.out.printf("%c", buf[y][x]);
			System.out.println();			
		}	
	}
}


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- header -->
	<div>
	<!-- 구조 각 의미 있는 애들 끼리 그룹핑 -->
		<h1>뉴렉처 온라인</h1>
		<div>		
			<h2>헤더</h2>			
			<div>
				<h3>메인 메뉴</h3>
				<ul>
					<li>학습가이드</li>
					<li>강좌선택</li>
					<li>AnswerIs</li>
				</ul> 			
			</div>
			<div>
				<h3>과정 검색 폼</h3>
				<form>
					<fieldset>
						<legend>검색필드</legend>
						<label>과정검색</label>
						<input type="text" />
						<input type="button" value="검색" />
					</fieldset>
				</form>
			</div>
			<div>
				<h3>회원 메뉴</h3>
				<ul>
					<li>HOME</li>
					<li>로그인</li>
					<li>회원가입</li>
				</ul>
			</div>		
			<div>
				<h3>고객센터 메뉴</h3>
				<ul>
					<li>마이페이지</li>
					<li>고객센터</li>
				</ul>
			</div>
		</div>
	</div>
	<!-- body -->
	<div>
		<!-- aside -->
		<div>
			<h2>고객센터</h2>
			<div>
				<h3>고객센터메뉴</h3>
				<ul>
					<li>공지사항</li>
					<li>자주하는 질문</li>
					<li>수강문의</li>
					<li>이벤트</li>
				</ul>
			</div>
			<div>
				<h3>협력업체</h3>
				<ul>
					<li>노트펍스</li>
					<li>나무랩연구소</li>
					<li>한빛미디어</li>
					<li>에이콘아카데미</li>
					<li>쌍용교육센터</li>		
				</ul>
			</div>
		</div>
		<!-- main -->
		<div>
			<h2>공지사항</h2>				
			<div>
				<h3>네비게이션 메뉴</h3>
				<ul>
					<li>home</li>		
					<li>고객센터</li>
					<li>공지사항</li>
				</ul>
			</div>
			
			<div>  
				<h3>공지사항 표</h3>
				<table board="1">
					<thead>
						<tr>
							<td>번호</td>
							<td>제목</td>
							<td>작성자</td>
							<td>작성일</td>
							<td>조회수</td>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>10</td>
							<td>서비스 중지 사유에 대해서..</td>
							<td>newlec</td>
							<td>2018-06-16</td>
							<td>85</td>
						</tr>
					</tbody>
				</table>
			</div>			
			
			<div>
				<h3>인덱스</h3>
				<div>1 / 1 pages</div>
			</div>
			<div>
				<h3>페이저</h3>
				<div>이전</div>
				<ul>
				<li>다음</li>
				</ul>
				<div>1</div>
			</div>
		</div>
	</div>
	<!-- footer -->
	<div>
	</div>
</body>
</html>