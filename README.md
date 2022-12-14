
<h1 align="center"><b>Brick-Out-Game</b></h1>

# **개요**
<a href="https://imgbb.com/"><img src="https://i.ibb.co/x5yxNQs/playing1.gif" width="200" alt="playing1" border="0"></a>  <a href="https://imgbb.com/"><img src="https://i.ibb.co/nmb2Vh5/playing-mouse1.gif" width="200" alt="playing-mouse1" border="0"></a>  
플레이어 바, 혹은 마우스를 이용해 **공을 움직여 화면에 보이는 블럭을 부수는 것**이 목적인 게임입니다. 게임을 시작한 뒤 **모드**(키보드모드, 마우스모드, 랭킹)를 선택할 수 있으며 GameOver가 되기 전까지의 점수를 기록해 랭킹 기능을 수행합니다. 

# **플레이 방법**

### < 모드를 고르세요! >  
<a href="https://imgbb.com/"><img src="https://i.ibb.co/V2gFC7b/image.jpg" width = "500" alt="image" border="0"></a>

게임을 실행하면 **Mode Select Frame**이 반겨줄 것입니다.  
**Mouse Mode**에서는 마우스로 조작하는 게임을 플레이 할 수 있습니다.  
**KeyBoard Mode**에서는 키보드로 조작하는 게임을 플레이 할 수 있습니다.  
**Rank**에서는 고득점한 순서대로 보여줍니다.
- - -
### < Mouse Mode >
#### 시작화면
<a href="https://ibb.co/rZjx40W"><img src="https://i.ibb.co/D7J95Wq/image.png" alt="image" width ="200" border="0"></a>
- - -
- **이동**  
<a href="https://imgbb.com/"><img src="https://i.ibb.co/J587KJr/playing-mouse-principle.gif" width = "200" alt="playing-mouse-principle" border="0"></a><br />  
마우스를 움직일 위치로 클릭하면 **클릭한 방향으로 공이 움직입니다**.  
움직이는 중에도 방향을 바꿀 수 있습니다.

 - **블럭 생성**  
<a href="https://imgbb.com/"><img src="https://i.ibb.co/YckWbW8/playing-mouse-new-Brick-Line.gif" width = "200" alt="playing-mouse-new-Brick-Line" border="0"></a><br />  
바닥에 닿은 경우 **새로운 블록이 생성되어 내려옵니다**.   
이때 생성되어 내려오는 블럭은 이전 블록에 비해 내구도가 증가합니다.

 - **게임 오버**  
 <a href="https://imgbb.com/"><img src="https://i.ibb.co/PThRrzg/image.png" width = "200" alt="image" border="0"></a>  
 블럭이 바닥에 닿은 경우 **GameOver**됩니다.  

### **최대한 떨어지지 않고 블럭을 부셔 최고 점수를 노려보세요!**
- - -
### < KeyBoard Mode>
#### 시작화면  
<a href="https://imgbb.com/"><img src="https://i.ibb.co/ZzRMvtM/image.png" width = "200" alt="image" border="0"></a>
- - -
- **시작 및 이동**  
<a href="https://imgbb.com/"><img src="https://i.ibb.co/Xb4sPz8/playing-mouse-press-Button.gif" width = "200" alt="playing-mouse-press-Button" border="0"></a>  
**Round Start 버튼**을 누르면 공이 움직이기 시작합니다.   
플레이어 바는 **키보드 화살표키**로 움직일 수 있습니다.

- **라운드 종료**  
 <a href="https://imgbb.com/"><img src="https://i.ibb.co/Qcc2WgS/playing-keyboard-round-Over.gif" width = "200" alt="playing-keyboard-round-Over" border="0"></a>  
블럭을 전부 부수면 **동작이 멈추고 Round Start 버튼이 다시 활성화됩니다.**

- **다음 라운드 진행**  
 <a href="https://imgbb.com/"><img src="https://i.ibb.co/w6s043X/playing-keyboard-round-Restart.gif" width = "200" alt="playing-keyboard-round-Restart" border="0"></a>  
동작이 멈춘 상태에서 **Round Start 버튼을 누르면 블럭**이 다시 생성됩니다.  
이전 라운드에 비해 블럭의 내구도가 높아집니다. 

- **게임 오버**  
<a href="https://imgbb.com/"><img src="https://i.ibb.co/nCcXPCZ/key-Board-Game-Over.png" width = "200" alt="key-Board-Game-Over" border="0"></a>  
 블럭이 아래로 떨어진 경우 **Game Over**됩니다.  

### **끝까지 집중력을 유지해서 최고 점수를 노려보세요!**
- - - 
### < RANK >
#### 시작화면
<a href="https://imgbb.com/"><img src="https://i.ibb.co/2N5WcQX/image.png" width = "300" alt="image" border="0"></a>  
mySQL을 이용해 데이터베이스와 통신하여 현재 랭킹을 보여준다. 
- - -
- #### GameOver 발생 시  
<a href="https://imgbb.com/"><img src="https://i.ibb.co/Dt7qdxS/image.png" alt="image" border="0"></a>  
Input Dialog를 띄워 이름을 입력 받는다.  (예시로 READMD.md로 입력해보았다.)  
<br>
<a href="https://imgbb.com/"><img src="https://i.ibb.co/sPPnZqs/image.png" width = "300" alt="image" border="0"></a>  
이름을 입력하고 OK 버튼을 누르면 랭킹 창을 띄워준다.   
(8위에 README.md가 기록된 것을 확인할 수 있음.)
</br>

# **프로젝트에 대하여**
## 프로그램 실행
 - **방법 1**  
	 Github Release에 업로드 된  .jar 파일을 다운 받아 실행시킨다.  
- **방법 2**
	Github의 프로젝트를 다운 받은 후, mySQL 통신과 관련된 java 외부 라이브러리(mysql-connector-j)를 프로젝트에 추가해 실행한다.  
	
	- **MySQL Connector/J 다운로드 링크:** https://dev.mysql.com/downloads/connector/j/
## 프로그램 설계도 
### 모듈 사이의 관계도
<a href="https://ibb.co/5s2V6ff"><img src="https://i.ibb.co/BTwRtSS/image.jpg" width = "500" alt="image" border="0"></a>

**ModeSelector:** 게임 모드를 선택하는 프레임을 주관하는 모듈이다.  
KeyBoard Mode를 누르면 KeyBoardGame모듈의 StartKeyBoard를 불러 실행한다.  
Mouse Mode를 누르면 MouseGame 모듈의 StartMouse를 불러 실행한다.  
  
**KeyBoardGame:** 키보드 게임을 주관하는 모듈이다.  
  
**MouseGame:** 마우스 게임을 주관하는 모듈이다.  

**ranking:** 랭킹 시스템을 주관하는 모듈이다.  
  
**game:** 키보드 게임과 마우스 게임 사이의 겹치는 기능을 모아 놓은 모듈이다.  
- - -
### game 모듈

<a href="https://ibb.co/YLMqP4g"><img src="https://i.ibb.co/BCxScHk/3.jpg" alt="3" width = "500" border="0"></a><br />  
**Brick, BrickMap:** 블럭과 관련된 클래스이다.  
  
**Box:** 게임 플레이 프레임과 관련된 클래스이다.  
  
**MovingBall:** 공과 관련된 클래스이다.  
  
**Player:** 플레이어와 관련된 클래스이다.  
  
**(Score/Brick/Box/Ball)Writer:** 각 기능을 그리는 클래스이다.  
  
**AnimationWriter:** 실제 게임 컴포넌트를 출력해주는 클래스이다.  
  
**BrickBreakerController:** 게임 플레이를 컨트롤해주는 클래스이다.  
- - -
### MouseGame 모듈
<a href="https://ibb.co/yW49hHr"><img src="https://i.ibb.co/ChPcJRf/4.jpg" width = "500" alt="4" border="0"></a><br />
game 모듈과 색이 다른 클래스는 상속받아 새로운 기능을 추가한 클래스이다.

**StartMouse:** 마우스 게임을 실행시켜주는 클래스이다.

**MAnimationWriter:** 마우스 게임에 맞는 컴포넌트를 출력해주는 클래스이다.

**MBrickWriter, MBrickMap, MBrick:** 블럭의 정보, 블럭의 새로운 생성 등의 기능을 추가한 클래스들이다.  
  
**MMovingBall:** 바닥의 닿았을 때의 경우를 고려한 공에 대한 클래스이다.  
- - - 
### KeyBoardGame 모듈
<a href="https://ibb.co/6FKfZ1P"><img src="https://i.ibb.co/cQW7vCF/image.jpg" width = "500" alt="image" border="0"></a>  
game 모듈과 색이 다른 클래스는 새로 만들었거나 상속받아 새로운 기능을 추가한 클래스이다.  
  
**StartKeyBoard:** 키보드 게임을 실행시켜주는 클래스이다.  
  
**KBrickBreakerController:** 라운드 시작, 종료 기능을 추가하여 컨트롤해주는 클래스이다.  
  
**KAnimationWriter:** 키보드 게임에 맞는 컴포넌트를 출력해주는 클래스이다.  
  
**KBrickWriter, KBrickMap, KBrick:** 블럭의 재생성, 체력 등의 키보드게임에 맞는 기능을 추가한 클래스들이다.  
  
**KMovingBall:** 블럭맵의 변화를 적용시켜주는 기능을 추가한 공에 대한 클래스이다.  
  
**RoundStartButton:** RoundStart 버튼 관련 클래스이다.  
  
**InitialIzeForNextRound:** 새로운 블럭맵을 생성하는 기능에 대한 클래스이다.  
  
**RoundWriter:** 우측 상단에 현재 Round를 출력해주는 기능이다.  
- - -
## 역할 분담 
| 일자 (주차) | 역할 분담 |
| :---: |---|
|11/17 ~ 11/23  (1주차)|**프로젝트 주제 선정** : 주제 아이디어를 모아서 투표를 통하여 정함. (팀원 전부)<br>**깃허브 저장소 생성**  : 장혁수: 만들어서 팀원을 초대함 </br>|
|11/24 ~ 11/30 (2주차)|**게임 제작** :<br> 김태훈: 기본적인 벽돌 깨기 게임을 제작함.</br><br>장혁수: 랭킹 시스템을 추가하기위한 클래스 제작. (랭킹은 csv파일로 저장하도록 제작함.  추후 게임 결과를 반영하도록 수정 할 예정이다.)</br>|
|12/01 ~ 12/06  (3주차)|**게임 제작** : 게임을 키보드와 마우스로 플레이하는 방식을 나누어 제작해보기로 함<br> 장혁수: 키보드와 마우스가 겹치는 클래스를 합침.</br><br> - **마우스 게임 개발**:</br><br> 홍보석: 벽돌에 체력이 나오게 만들었고, 녹색 공을 랜덤으로 추가해 공을 먹으면 사라지게 만듬.</br><br> - **키보드 게임 개발:**</br><br> 김태훈: 벽돌을 부술시 스코어가 올라가고 이를 보여주는 기능을 추가함.</br><br> 성윤제: 벽돌에 체력을 추가하고 이를 보여주는 기능을 추가함.</br>|
|12/07 ~ 12/14 (4주차)|**게임 제작:**<br> **- 마우스 게임 개발:**</br><br> 홍보석: 초록 라인에 공이 닿을 시 벽돌이 한라인씩 아래로 내려오게 만듬.</br><br> **- 키보드 게임 개발:**</br><br> 김태훈: 라운드 시작 버튼을 만들고, 누를시 라운드가 시작하도록 만듬.</br><br> 성윤제: 라운드가 끝나고 다음 라운드가 시작할 때, 벽돌이 재생성되도록 만듬.<br></br> **- 랭킹 기능 개발:**</br><br> 최수환: 게임이 끝났을 때, 스코어를 엑셀 파일에 저장해주는 기능을 구현함. -> **온라인 리더 보드 기능으로 확장함 (MySQL 이용)**|
# **개선 방향**
- **키보드 모드의 단조로움**
	-  기존의 블럭 깨기 게임에 비교해서 기능이 적은 편이다. 라운드가 증가하면서 변하는 것은 블럭의 체력밖에 없으며, 특정 블럭을 부셨을 시 공이 늘어난다거나, 블럭이 생성된다거나 등의 추가 기능이 존재하지 않음. 
	- **라운드의 증가에 따라 변화를 주고, 아이템 기능을 추가**할 필요가 있다고 생각한다.
- **마우스 모드의 난이도**
	- 마우스로 진행하는 블럭 깨기 게임은 조작이 새로워 단조로움은 덜하지만 난이도가 쉬워 특별한 동작 없이도 게임이 끝나지 않을 수 있다. (아래 바닥에 공이 닿아야만 새로운 블럭이 내려옴)
	- **시간에 따라 자동적으로 블럭이 내려오는 등의 기능을 추가**할 필요가 있다고 생각한다. 
