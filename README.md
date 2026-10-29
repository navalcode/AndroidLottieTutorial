# Android Lottie Tutorial

[Español](README.es.md)

A Kotlin/Views animation example with Lottie interactions, scaling transitions and image changes. The Android project lives in [`LottieAndroidTutorial/`](LottieAndroidTutorial/).

## Read the code

- [`MainActivity.kt`](LottieAndroidTutorial/app/src/main/java/com/navalcode/lottietutorial/MainActivity.kt): Lottie interactions.
- [`CustomAnimation.kt`](LottieAndroidTutorial/app/src/main/java/com/navalcode/lottietutorial/CustomAnimation.kt): scale and image transitions.
- [`SplashActivity.kt`](LottieAndroidTutorial/app/src/main/java/com/navalcode/lottietutorial/SplashActivity.kt): application entry.

## Toolchain and assets

This earlier example uses `kotlinx.android.synthetic` and needs a toolchain migration before a current build can be claimed. Template tests do not validate the animation behavior. Animation resources retain their project references and are not attributed as original artwork.

For Compose effects and lifecycle examples with current tests, see [Compose Effect Lab](https://github.com/navalcode/compose-effect-lab).
