package com.girlFriend;

class Boy {
     GirlFriend friend;
     void setGirlFriend (GirlFriend f){
         friend = f;
     }

     void showGirlFriend(){
         friend.speaking();

         friend.cooking();
     }
}
