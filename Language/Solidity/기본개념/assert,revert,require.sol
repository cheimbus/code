// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.4.22 <0.8.0;

contract lec9 {
    /*
    0.4.22~0.7.x 하위 버전에서의 사용법
    에러핸들러 
    assert : gas를 다 소비한후, 특정한 조건에 부합하지 않으면 에러를 발생시킨다.
    assert(조건문)
    revert: 조건없이 에러를 발생시키고, gas를 환불 시켜준다. 
    revert("에러 메세지");
    require: 특정한 조건에 부합하지 않으면 에러를 발생시키고, gas를 환불 시켜준다.
    require(조건문,"에러메세지")
    */

    function assertNow(uint256 _a) public pure {
        assert(_a >= 5);
    }

    function revertNow(uint256 _a) public pure {
        if (_a < 5) {
            revert("Must be more than 5");
        }
    }

    function requireNow(uint256 _a) public pure {
        require(_a >= 5, "Must be more than 5");
    }
}

// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.7.0 <0.9.0;

contract lec10 {
    /*
    - 0.8~
    에러핸들러
    - assert의 가스량이 줄음 
    - 솔리디티 다큐멘테이션에 의하면 assert는 오직 내부적 에러 테스트 용도, 불변성 체크 용도로 사용
    - assert가 에러를 발생시키면 Panic(uint256) 이라는 에러타입의 에러를 발생 (try/catch에서 사용)
    */

    function assertNow(uint256 _a) public pure {
        assert(_a >= 5);
    }

    function revertNow(uint256 _a) public pure {
        if (_a >= 5) {
            revert("Must be more than 5");
        }
    }

    function requireNow(uint256 _a) public pure {
        require(_a >= 5, "Must be more than 5");
    }
}
