grammar DecSol;

program: expression+ ;
expression : 'create' (contract | asset | transaction | bid | event);
contract: 'contract' contractName ('accepts offers')?;

transaction: 'transaction' transactionName 'in' contractName 'that' transactionType (emit)? (on)?;
transactionType : ('deposits' deposit) | ('withdraws' withdraw) | ('swaps' swap) | ('transfers' transfer) | ('buys'  service);
deposit : 'value' val 'from wallet' address;
withdraw : 'value' val 'into wallet' address;
swap : 'token' tokenID 'with' val 'from wallet' address;
transfer : 'amount' amount 'to wallet' wallet;
service : 'service' serviceName 'with amount' amount ('every' NUMBER 'days')?;

event: 'event' eventName 'in contract' contractName '('NAME (',' NAME)* ')' ;
emit : 'and emits' eventName '('NAME (',' NAME)* ')';

bid: 'bid' 'in' contractName 'on' assetName 'for' NUMBER  'days';

asset: 'asset' assetType assetName 'in' contractName ;
assetType: ('wallet'|'nft'|'oracle');


on: 'on' condition;
condition: finalcondition (LOGICALOPERATOR finalcondition)*;
finalcondition : ('not')? (assetCondition | timeCondition | dateCondition) ;


assetCondition : assetName CONDITIONALOPERATOR (NAME | NUMBER);
timeCondition : 'time' CONDITIONALOPERATOR time;
dateCondition: 'date' CONDITIONALOPERATOR date;



assetName : NAME;
transactionName : NAME;
address : NAME;
val : NAME;
tokenID : NAME;
eventName : NAME;
contractName : NAME;
amount : NAME;
wallet : NAME;
serviceName : NAME;


time: HOURS ':' MINUTES ':' SECONDS;
date: DAY '-' MONTH '-' YEAR;


NUMBER: DIGIT+([.] DIGIT+)?;
DIGIT:   [0-9];
DAY:    [0-9][0-9]?;
MONTH:  [0-9] [0-9]?;
YEAR:   [0-9] [0-9] [0-9] [0-9];
HOURS:   [0-2] [0-9];
MINUTES: [0-5]? [0-9];
SECONDS: [0-5]? [0-9];


LOGICALOPERATOR : ('and' | 'or');
CONDITIONALOPERATOR : '<' | '>' |'<=' |'>=' |'!=' |'==' ;
NAME : [a-zA-Z][a-zA-Z0-9.]*;
WS: [ \t\u000C\r\n]+ -> skip;
