SET TAG_VERSION="0.8.1.2"

IF "%APPVEYOR_REPO_BRANCH%" == "pre-release" git tag -a %TAG_VERSION% -m "%APPVEYOR_REPO_COMMIT_MESSAGE_EXTENDED%"
IF "%APPVEYOR_REPO_BRANCH%" == "release" git tag -a %TAG_VERSION% -m "%APPVEYOR_REPO_COMMIT_MESSAGE_EXTENDED%"

git push origin --tags