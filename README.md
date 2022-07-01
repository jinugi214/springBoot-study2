# springBoot-study2

패스트캠퍼스의 강의를 통하여 공부하며 만든 프로젝트입니다.
SpringBoot, JPA를 통하여 프론트에서 들어오는 요청을 컨트롤러에서 RestController를 통하여 JSON으로 반환하는 방식을 사용하였으며
JPA Auditing을 활용하여 데이터가 추가되거나 수정될 때 날짜가 자동으로 들어가게 하였습니다.
그리고 Service부분에서 공통적으로 사용되는 부분은 Interface화하여 Override를 통하여 사용할 수 있게 하였습니다. 
Entity에서는 정해진 값만 들어가는 부분은 Enum클래스를 활용하여 @Enumerated(EnumType.STRING) 어노테이션을 사용하였습니다.


프론트의 경우 Vue.js 방식을 사용하였으나 이부분은 강의자료를 받아서 그대로 사용한 부분이라 자세하게는 모르지만
이부분에 대해서는 후에 공부해볼 것입니다.
