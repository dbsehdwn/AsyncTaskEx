# AsyncTaskEx

동작순서
1. 버튼을 눌러 asynctask 호출
2. onPreExeute() - state textview를 "working"으로 변경
3. doInBackground() - 새로 만들 스레드에 i를 0부터 10까지 1씩 증가, 값이 증가할때마다 publishProgress() 호출
4. onProgressUpdate() - publishProgress()가 호출될 때 마다 자동으로 호출, 화면의 count 값 증가
5. onPostExcuted() - doInBackground()가 끝나면 호출,  state를 "done"으로 


동작화면
<div>
  <img width="200" src="https://user-images.githubusercontent.com/59160428/76055888-47b6b980-5fb8-11ea-82b6-4d604dd4e2d9.jpg">
  <img width="200" src="https://user-images.githubusercontent.com/59160428/76056139-1ee2f400-5fb9-11ea-8963-695b228d63e0.jpg">
  <img width="200" src="https://user-images.githubusercontent.com/59160428/76056140-22767b00-5fb9-11ea-9a1f-59ba7e675e35.jpg">
</div>
