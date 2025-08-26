# Toast and Logs
---
### This assignment covers the Android Activity Lifecycle using Toast and Logs.

Lifecycle Methods Covered: <br>
onCreate() → Activity is created (UI setup happens here). <br>
onStart() → Activity is about to become visible. <br>
onResume() → Activity is visible and interactive. <br>
onPause() → Activity is partially visible (e.g., another activity is opening). <br>
onStop() → Activity is hidden (not visible). <br>
onRestart() → Activity is restarting after being stopped. <br>
onDestroy() → Activity is destroyed (before the app closes). <br>

What happens when you run it: <br>
Each time a lifecycle method is called, you’ll see: <br>
A Toast message (on-screen popup). <br>
A Log message (visible in Logcat in Android Studio with tag "ActivityLifeCycle"). <br>

# Preview:

## onCreate

<img src="create.png">

## onStart
<img src="start.png">

## onRestart

<img src="restart.png">
