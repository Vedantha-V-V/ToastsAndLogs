# Toast and Logs
---
This assignment covers the Android Activity Lifecycle using Toast and Logs.

Lifecycle Methods Covered:
onCreate() → Activity is created (UI setup happens here).
onStart() → Activity is about to become visible.
onResume() → Activity is visible and interactive.
onPause() → Activity is partially visible (e.g., another activity is opening).
onStop() → Activity is hidden (not visible).
onRestart() → Activity is restarting after being stopped.
onDestroy() → Activity is destroyed (before the app closes).

What happens when you run it:
Each time a lifecycle method is called, you’ll see:
A Toast message (on-screen popup).
A Log message (visible in Logcat in Android Studio with tag "ActivityLifeCycle").
