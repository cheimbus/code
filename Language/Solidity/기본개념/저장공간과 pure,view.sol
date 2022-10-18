// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.7.0 <0.9.0;

contract lec3 {
    /*
        저장 공간
        1. storage
            영속적인 읽고/쓰기 가능한 저장 공간
            가스 비용 비쌈
            함수의 외부나, 함수가 저장 
        2. memory
            휘발적인 읽고/쓰기 가능한 저장 공간
            함수의 내부에 정의된 변수, 매개변수, 반환값 등이 사용
        3. colladata 
            읽기 가능한 공간
            external의 매개변수에 적용
        4. stack 
            EVM (Ethereum Virtual Machine) 에서 stack data를 관리할때 쓰는 영역
            1024Mb 제한
        함수의 모디파이어 : 함수의 행동을 제한 
        pure, view, payable 
        pure: 순수하게 함수안에있는 변수만 사용할 때
        view: 함수 밖에 있는 변수, 함수를 읽어 올 때     
    */

    uint256 public a = 1; // storage에 저장됨

    function fun2() public pure returns (uint256) {
        // 함수 안에서 사용되는 변수. 휘발성이 있음
        uint256 b = 4;
        return b;
    }

    function fun1() public view returns (uint256) {
        // 함수 밖에 storage를 읽어 옴
        return a;
    }

    function fun3() public returns (uint256) {
        // pure나 view를 사용할 수 없음. storage를 변경하고 리턴하는 함수이기 때문
        a = 3;
        return a;
    }

    function fun4(string memory _str) public pure returns (string memory) {
        // 참조타입인 string은 저장공간을 지정해줘야함 휘발성인 memory에 저장함
        return _str;
    }
}
