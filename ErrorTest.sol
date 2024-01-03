//SPDX-License-Identifier: UNLICENSED 
pragma solidity ^0.8.13;
contract MyContract {


uint internal value;

event ValueSet(uint val);

function getValue() public view  returns(uint param1){
return value;
}

function setValue(uint val) public {
value = val;
emit ValueSet(value);
}

}

