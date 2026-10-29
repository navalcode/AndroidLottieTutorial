# Android Lottie Tutorial

[English](README.md)

Ejemplo de aprendizaje de animaciones en una interfaz Android con Kotlin y Views. El proyecto está en [`LottieAndroidTutorial/`](LottieAndroidTutorial/).

## Qué contiene

- Animaciones Lottie asociadas a acciones de la interfaz.
- Transiciones de escala y cambio de imagen.
- Una pantalla de entrada y una actividad con los ejemplos.

## Por dónde leerlo

- [`MainActivity.kt`](LottieAndroidTutorial/app/src/main/java/com/navalcode/lottietutorial/MainActivity.kt): interacción con los ejemplos Lottie.
- [`CustomAnimation.kt`](LottieAndroidTutorial/app/src/main/java/com/navalcode/lottietutorial/CustomAnimation.kt): transición de escala y cambio de imagen.
- [`SplashActivity.kt`](LottieAndroidTutorial/app/src/main/java/com/navalcode/lottietutorial/SplashActivity.kt): entrada a la aplicación.

## Contexto

Es un ejemplo histórico con el toolchain y las convenciones de su momento. Utiliza `kotlinx.android.synthetic`; su actualización y compilación con herramientas actuales están pendientes. Los tests de plantilla presentes no se presentan como una validación funcional de las animaciones.

Los recursos de animación conservan sus referencias en el proyecto; su presencia no implica autoría propia de esos recursos. Para ejemplos actuales con Compose, efectos y ciclo de vida, consulta [Compose Effect Lab](https://github.com/navalcode/compose-effect-lab).
