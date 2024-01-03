//SPDX-License-Identifier: UNLICENSED 
pragma solidity ^0.8.20;
contract Auction {


mapping(uint=>address) public NFTOwners;
mapping(address=>uint) public deposit;
uint public tokenCounter = 0;
uint internal tokenId;
address payable public seller ;
uint internal endat;
bool public started;
bool public ended;
address public highestBidder ;
uint public highestBid;
mapping(address=>uint) internal bids;

function ownerOf(uint tokenID) public view  returns(address owner){
return NFTOwners[tokenID];
}

function createToken(address owner) public  returns(uint tokenID){
tokenCounter++;
NFTOwners[tokenCounter] = owner;
return tokenCounter;
}

function start() external {
require(!started,"started");
require(seller==msg.sender,"not seller");
NFTOwners[tokenId] = msg.sender;
started = true;
endat = block.timestamp+ 7 days;
}

function end() external {
require(started, "not started");
require(block.timestamp >= endat, "not ended");
require(!ended, "ended");
ended = true;
if (highestBidder != address(0)) {
NFTOwners[tokenId] = highestBidder;
seller.transfer(highestBid);}
 else {
NFTOwners[tokenId] = seller;
}
}

function bid() external payable {
require(started, "not started");
require(block.timestamp < endat);
require(msg.value > highestBid);
if(highestBidder != address(0)) {
bids[highestBidder]+=highestBid;
}
highestBidder = msg.sender;
highestBid = msg.value;
}

function withdraw() external {
uint bal = bids[msg.sender];
bids[msg.sender] = 0;
payable(msg.sender).transfer(bal);
}

}

