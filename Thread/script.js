//DOM Elements
const mainPage = document.querySelector(".main-page");
const loginPage = document.querySelector(".login-page");
const middleContent = document.querySelector(".middle-content");
const btnTop = document.querySelector(".btn-top");
const newsFeedPage = document.querySelector(".feeds-page");
const loginModal = document.querySelector(".login-modal");
const modalX = document.querySelector(".login-modal i");
const loginFormBtn = document.querySelector(".login-form-btn");
const postBtn = document.querySelector(".post-btn");
const modalWrapper = document.querySelector(".modal-wrapper");
const modal = document.querySelector(".modal");
const postModalX = document.querySelector(".modal-header i");
const modalPostBtn = document.querySelector(".modal-header button");
const modalFooterPlus = document.querySelector(".modal-footer span");
const modalInput = document.querySelector(".modal-input");
const user = document.querySelector(".user");
const sidebar = document.querySelector(".sidebar");
const sidebarWrapper = document.querySelector(".sidebar-wrapper");
const xBtn = document.querySelector(".sidebar-header i");
const toggle = document.querySelector(".toggle");
const circle = document.querySelector(".circle");
const like=document.querySelectorAll(".like")
const dislike=document.querySelectorAll(".dislike")

console.log(dislike)
for(let i=0;i<like.length;i++){
  like[i].addEventListener("click",function(){
    if((like[i].getAttribute("style"))=='font-size:20px;color:#117abb;'){
      like[i].setAttribute("style","font-size:20px;color:rgb(189, 187, 187);")
      dislike.forEach(item => {
        dislike[i].setAttribute("style","font-size:20px;color:rgb(189, 187, 187);");
      })
    }
    else{
      like[i].setAttribute("style","font-size:20px;color:#117abb;")
      dislike.forEach(item => {
        dislike[i].setAttribute("style","font-size:20px;color:rgb(189, 187, 187);");
      })
    }
  })
}
for(let i=0;i<dislike.length;i++){
  dislike[i].addEventListener("click",function(){
    if((dislike[i].getAttribute("style"))=='font-size:20px;color:#117abb;'){
      dislike[i].setAttribute("style","font-size:20px;color:rgb(189, 187, 187);")
      like.forEach(item => {
        like[i].setAttribute("style","font-size:20px;color:rgb(189, 187, 187);");
      })
    }
    else{
      dislike[i].setAttribute("style","font-size:20px;color:#117abb;")
      like.forEach(item => {
        like[i].setAttribute("style","font-size:20px;color:rgb(189, 187, 187);");
      })
    }
  })
}
/****************************************** */
let mainuser=JSON.parse(localStorage.getItem("mainuser"));
let alluser=JSON.parse(localStorage.getItem("accounts"));
let showu=document.getElementById("showuser");
if(alluser==null){
  showu.innerHTML=``;
}
else{
  // console.log(mainuser)
  if(mainuser[0]=='admin'){
    let tt1=
    `<ul style="list-style-type: none;padding: 30px; font-size:15px">` 
    for(let i=0;i<alluser.length;i++){
      tt1+=`<li>Name - ${alluser[i].Username} Password - ${alluser[i].Password}</li>`
    }
    tt1+=`</ul>`
    // showu.style.color="white";
    showu.innerHTML=tt1;
  }
  else{
    showu.innerHTML=``;
  }
}


// NEWS FEED PAGE
// post modal
postBtn.addEventListener("click", () => {
  modal.style.display = "block";
  modalWrapper.classList.add("modal-wrapper-display");

  if (modalInput.value !== "") {
    modalInput. value = "";
    changeOpacity(0.5);
  }
});

const changeOpacity = (x) =>{
  modalPostBtn.style.opacity =x;
  modalFooterPlus.style.opacity =x;
};


postModalX.addEventListener("click", () => {
  modal.style.display = "none";
  modalWrapper.classList.remove("modal-wrapper-display");
});

modalInput.addEventListener("keypress", (e) => {
  if (e.target.value !== ""){
    changeOpacity(1);}
  });
modalInput. addEventListener ("blur", (e) => {
  if (e.target. value === ""){
   changeOpacity(0.5);}
});
//Sidebar

user.addEventListener("click", () => {

sidebar.classList.add("sidebar-display");
 sidebarWrapper.classList.add("sidebar-wrapper-display");
});

xBtn.addEventListener("click", () => {
sidebar.classList.remove("sidebar-display"); 
sidebarWrapper.classList.remove("sidebar-wrapper-display");
});


//dark-mode

const darkElements1 = document.querySelectorAll(".dark-mode-1");
const darkElements2 = document.querySelectorAll(".dark-mode-2");
const lightTexts = document.querySelectorAll(".light-text");
const borders = document.querySelectorAll(".border");

toggle.addEventListener("click", () =>{
circle.classList.toggle("move");

Array.from(darkElements1).map((darkEl1) =>
darkEl1.classList.toggle("dark-1")
);
Array.from(darkElements2).map((darkEl2) =>
darkEl2.classList.toggle("dark-2")
);
Array.from(lightTexts).map((lightText) =>
lightText.classList.toggle("light")
);

Array.from(borders).map((border) =>
border.classList.toggle("border-color")
);
});


//icons





const follow=document.querySelectorAll('.follow-btn');

//connect to connected
let farray=Array.from(follow);
farray.forEach(ele => {
  ele.addEventListener("click",()=>{
    if(ele.innerText=="Connect"){
      ele.innerText="Connected";
      ele.style.width="fit-content";
      ele.style.backgroundColor="#00a2e9"
      ele.style.color="white";
    }
    else{
      ele.innerText="Connect";
      ele.style.backgroundColor="white"
      ele.style.color="#00a2e9";
    }
  });
})


//post-direct



document.getElementById("post-direct").addEventListener("keypress",(event)=>{if(event.key=='Enter'){
  directpost();
}});

function directpost(){
const outerDiv = document.createElement('div');
outerDiv.classList.add('post', 'border');

// Create the user-avatar div and its image element
const userAvatarDiv = document.createElement('div');
userAvatarDiv.classList.add('user-avatar');
const userAvatarIcon = document.createElement('i');
userAvatarIcon.classList.add('fas', 'fa-user-circle');
userAvatarIcon.style.fontSize = '6rem';

userAvatarDiv.appendChild(userAvatarIcon);

// Create the post-content div and its child elements
const postContentDiv = document.createElement('div');
postContentDiv.classList.add('post-content');
const postUserInfoDiv = document.createElement('div');
postUserInfoDiv.classList.add('post-user-info', 'light-text');
const postUserInfoHeading = document.createElement('h4');
postUserInfoHeading.textContent = 'USERNAME';
const postUserInfoIcon = document.createElement('i');
postUserInfoIcon.classList.add('fas', 'fa-check-circle');
const postUserInfoSpan = document.createElement('span');
postUserInfoSpan.textContent = '@userid . Just Now';
postUserInfoDiv.appendChild(postUserInfoHeading);
postUserInfoDiv.appendChild(postUserInfoIcon);
postUserInfoDiv.appendChild(postUserInfoSpan);
const postTextP = document.createElement('p');
postTextP.classList.add('post-text', 'light-text');

const directpostText=document.getElementById("post-direct").value
postTextP.textContent = directpostText;

const postIconsDiv = document.createElement('div');
postIconsDiv.classList.add('post-icons');
const commentIcon = document.createElement('i');
commentIcon.classList.add('fas', 'fa-comment');
commentIcon.style.fontSize = '20px';
commentIcon.style.color = 'rgb(189, 187, 187)';
const likeIcon = document.createElement('i');
likeIcon.classList.add('fas', 'fa-thumbs-up', 'like');
likeIcon.style.fontSize = '20px';
likeIcon.style.color = 'rgb(189, 187, 187)';
const dislikeIcon = document.createElement('i');
dislikeIcon.classList.add('fas', 'fa-thumbs-down', 'dislike');
dislikeIcon.style.fontSize = '20px';
dislikeIcon.style.color = 'rgb(189, 187, 187)';
const shareIcon = document.createElement('i');
shareIcon.classList.add('fas', 'fa-share-alt');
shareIcon.style.fontSize = '20px';
shareIcon.style.color = 'rgb(189, 187, 187)';
postIconsDiv.appendChild(commentIcon);
postIconsDiv.appendChild(likeIcon);
postIconsDiv.appendChild(dislikeIcon);
postIconsDiv.appendChild(shareIcon);

// Append the child elements to the post-content div
postContentDiv.appendChild(postUserInfoDiv);
postContentDiv.appendChild(postTextP);
// postContentDiv.appendChild(postImgDiv);
postContentDiv.appendChild(postIconsDiv);

// Append the child elements to the outer div
outerDiv.appendChild(userAvatarDiv);
outerDiv.appendChild(postContentDiv);

// Get the parent element to append the outer div to
const parentElement = document.getElementById('posts-section');

// Append the outer div element to the parent element
parentElement.appendChild(outerDiv);

document.getElementById('post-direct').value="";
}












///post

function createpost(){

  // Create the outer div element
  console.log("createpost");
  const outerDiv = document.createElement('div');
  outerDiv.classList.add('post', 'border');
  
  // Create the user-avatar div and its image element
  const userAvatarDiv = document.createElement('div');
  userAvatarDiv.classList.add('user-avatar');
  const userAvatarIcon = document.createElement('i');
  userAvatarIcon.classList.add('fas', 'fa-user-circle');
  userAvatarIcon.style.fontSize = '6rem';
  
  userAvatarDiv.appendChild(userAvatarIcon);
  
  // Create the post-content div and its child elements
  const postContentDiv = document.createElement('div');
  postContentDiv.classList.add('post-content');
  const postUserInfoDiv = document.createElement('div');
  postUserInfoDiv.classList.add('post-user-info', 'light-text');
  const postUserInfoHeading = document.createElement('h4');
  postUserInfoHeading.textContent = 'USERNAME';
  const postUserInfoIcon = document.createElement('i');
  postUserInfoIcon.classList.add('fas', 'fa-check-circle');
  const postUserInfoSpan = document.createElement('span');
  postUserInfoSpan.textContent = '@userid . Just Now';
  postUserInfoDiv.appendChild(postUserInfoHeading);
  postUserInfoDiv.appendChild(postUserInfoIcon);
  postUserInfoDiv.appendChild(postUserInfoSpan);
  const postTextP = document.createElement('p');
  postTextP.classList.add('post-text', 'light-text');
  
  const postText=document.getElementById("post-input").value
  postTextP.textContent = postText;
  // const postImgDiv = document.createElement('div');
  // postImgDiv.classList.add('post-img');
  const postIconsDiv = document.createElement('div');
  postIconsDiv.classList.add('post-icons');
  const commentIcon = document.createElement('i');
  commentIcon.classList.add('fas', 'fa-comment');
  commentIcon.style.fontSize = '20px';
  commentIcon.style.color = 'rgb(189, 187, 187)';
  const likeIcon = document.createElement('i');
  likeIcon.classList.add('fas', 'fa-thumbs-up', 'like');
  likeIcon.style.fontSize = '20px';
  likeIcon.style.color = 'rgb(189, 187, 187)';
  const dislikeIcon = document.createElement('i');
  dislikeIcon.classList.add('fas', 'fa-thumbs-down', 'dislike');
  dislikeIcon.style.fontSize = '20px';
  dislikeIcon.style.color = 'rgb(189, 187, 187)';
  const shareIcon = document.createElement('i');
  shareIcon.classList.add('fas', 'fa-share-alt');
  shareIcon.style.fontSize = '20px';
  shareIcon.style.color = 'rgb(189, 187, 187)';
  postIconsDiv.appendChild(commentIcon);
  postIconsDiv.appendChild(likeIcon);
  postIconsDiv.appendChild(dislikeIcon);
  postIconsDiv.appendChild(shareIcon);
  
  // Append the child elements to the post-content div
  postContentDiv.appendChild(postUserInfoDiv);
  postContentDiv.appendChild(postTextP);
  // postContentDiv.appendChild(postImgDiv);
  postContentDiv.appendChild(postIconsDiv);
  
  // Append the child elements to the outer div
  outerDiv.appendChild(userAvatarDiv);
  outerDiv.appendChild(postContentDiv);
  
  // Get the parent element to append the outer div to
  const parentElement = document.getElementById('posts-section');
  
  // Append the outer div element to the parent element
  parentElement.appendChild(outerDiv);
  
  document.getElementById('post-input').value="";
  modalWrapper.classList.remove("modal-wrapper-display");
  
  }








