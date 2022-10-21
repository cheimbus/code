// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.7.0 <0.9.0;

contract lec6 {
    /*
    구조체(struct)
    보통 대문자로 시작함
    자신만의 자료형
    이벤트와 마찬가지로 자료형 변수명으로 사용됨. 값을 저장하지 않기때문
    struct를 이용하면 기존의 mapping이나 array에서 string, uint등을 다같이 넣을 때 편리하게 이용가능
    struct 구조체명 {
        자료형 변수명,
        자료형 변수명,
        자료형 변수명
    } 
    struct Human {
        string name;
        uint age;
    }
    */
    struct Human {
        string name;
        uint256 age;
    }

    mapping(uint256 => Human) public humanMapping;
    Human[] public humanArray;

    function createHuman(string memory _name, uint256 _age)
        public
        pure
        returns (Human memory)
    {
        return Human(_name, _age);
    }

    function createHumanMapping(
        uint256 _key,
        string memory _name,
        uint256 _age
    ) public {
        humanMapping[_key] = Human(_name, _age);
    }

    // struct 구조체를 가져올 때는 returns를 사용해야 에러가 안나온다.
    function getHumanMapping(uint256 _key) public view returns (Human memory) {
        return humanMapping[_key];
    }

    function createHumanArray(string memory _name, uint256 _age) public {
        humanArray.push(Human(_name, _age));
    }

    function getHumanArray(uint256 _key) public view returns (Human memory) {
        return humanArray[_key];
    }
}
