// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.7.0 <0.9.0;

contract lec4 {
    /*
       event 
        - 다른 프로그래밍 언어의 print 함수처럼 특정한 값을 출력
        - 블록체인의 특정 블록에 값을 저장. 
        - 함수 내부에서만 사용 가능, emit 키워드 사용.
        - event 이벤트명(자료형 변수명);
            event Info(string name, uint256 money);
        - 보통 이벤트명은 대문자로 시작함
    
    
    */

    event Info(string name, uint256 money); // event에는 저장공간을 지정하지 않아도 된다.

    function fun(string memory name, uint256 money) public {
        emit Info(name, money);
    }
}
