// Promise 객체 생성 (비동기 처리)
const p = new Promise((resolve, reject) => {
  setTimeout(() => {
    // 지정된 시간 (2000ms) 지난 후 함수 1번 실행
    let num = Math.random(); // 0-1 사이의 난수 발생
    if (num >= 0.8) {
      reject("생성된 숫자가 0.8 이상임 - " + num);
    }
    resolve(num);
  }, 2000);
});

p.then((result) => {
  console.log("처리 결과: ", result);
}).catch((error) => {
  console.log("오류: ", error);
});

console.log("## Promise 객체 생성!");
