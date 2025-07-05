# TapNDo

TapNDo is a mobile application (Android, Kotlin, Jetpack Compose) that connects people who need to get mini-work done with those willing to do it for payment.

## Features

- Phone-based login/registration
- Post and browse mini-tasks (with payment, location, deadline)
- Accept and complete tasks (with OTP-based verification)
- In-app chat or masked communication
- Profile management, task tracking and more

## Project Structure

```
app/
  src/
    main/
      java/com/tapndo/
        ui/screens/             # Each major screen as a composable file
        navigation/             # Navigation graph
        viewmodel/              # ViewModel files (MVVM pattern)
      res/
        values/                 # strings, colors, themes
        drawable/               # icons, images
      AndroidManifest.xml
```

## Getting Started

1. Clone the repo:
    ```bash
    git clone https://github.com/sameeratanveer14/TapNDo.git
    ```
2. Open in Android Studio.
3. Sync Gradle and run on an emulator or device.

## Next Steps

- Build out UI for each screen
- Connect to backend (Firebase or custom API)
- Add authentication, database, and chat/payment integrations

---

Feel free to contribute or suggest features!
