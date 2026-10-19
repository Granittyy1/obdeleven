package com.parse;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("_Installation")
public class ParseInstallation extends ParseObject {
    private static final List<String> READ_ONLY_FIELDS = Collections.unmodifiableList(Arrays.asList("deviceType", "installationId", "deviceToken", "pushType", "timeZone", "localeIdentifier", "appVersion", "appName", "parseVersion", "appIdentifier", "objectId"));

    public static ParseInstallation getCurrentInstallation() {
        try {
            return (ParseInstallation) ParseTaskUtils.wait(getCurrentInstallationController().getAsync());
        } catch (ParseException unused) {
            return null;
        }
    }

    public static ParseCurrentInstallationController getCurrentInstallationController() {
        return ParseCorePlugins.getInstance().getCurrentInstallationController();
    }

    private void updateLocaleIdentifier() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (TextUtils.isEmpty(language)) {
            return;
        }
        if (language.equals("iw")) {
            language = "he";
        }
        if (language.equals("in")) {
            language = "id";
        }
        if (language.equals("ji")) {
            language = "yi";
        }
        if (!TextUtils.isEmpty(country)) {
            Locale locale2 = Locale.US;
            language = O.a.f(language, "-", country);
        }
        if (language.equals(get("localeIdentifier"))) {
            return;
        }
        performPut("localeIdentifier", language);
    }

    private void updateTimezone() {
        String id = TimeZone.getDefault().getID();
        if ((id.indexOf(47) > 0 || id.equals("GMT")) && !id.equals(get("timeZone"))) {
            performPut("timeZone", id);
        }
    }

    private void updateVersionInfo() {
        synchronized (this.mutex) {
            try {
                try {
                    Context applicationContext = Parse.getApplicationContext();
                    String packageName = applicationContext.getPackageName();
                    PackageManager packageManager = applicationContext.getPackageManager();
                    String strValueOf = String.valueOf(packageManager.getPackageInfo(packageName, 0).versionCode);
                    String string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString();
                    if (packageName != null && !packageName.equals(get("appIdentifier"))) {
                        performPut("appIdentifier", packageName);
                    }
                    if (string != null && !string.equals(get("appName"))) {
                        performPut("appName", string);
                    }
                    if (strValueOf != null && !strValueOf.equals(get("appVersion"))) {
                        performPut("appVersion", strValueOf);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    PLog.w("com.parse.ParseInstallation", "Cannot load package info; will not be saved to installation");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseObject
    public <T extends ParseObject> Task<T> fetchAsync(final String str, final Task<Void> task) {
        Task<T> task2;
        synchronized (this.mutex) {
            try {
                task2 = (Task<T>) (getObjectId() == null ? saveAsync(str, task) : Task.forResult(null)).onSuccessTask(new Continuation<Void, Task<T>>() { // from class: com.parse.ParseInstallation.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<T> then(Task<Void> task3) {
                        return ParseInstallation.super.fetchAsync(str, task);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
        return task2;
    }

    public String getInstallationId() {
        return getString("installationId");
    }

    @Override // com.parse.ParseObject
    public Task<Void> handleFetchResultAsync(ParseObject.State state) {
        return super.handleFetchResultAsync(state).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseInstallation.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                return ParseInstallation.getCurrentInstallationController().setAsync(ParseInstallation.this);
            }
        });
    }

    @Override // com.parse.ParseObject
    public Task<Void> handleSaveResultAsync(ParseObject.State state, ParseOperationSet parseOperationSet) {
        Task<Void> taskHandleSaveResultAsync = super.handleSaveResultAsync(state, parseOperationSet);
        return state == null ? taskHandleSaveResultAsync : taskHandleSaveResultAsync.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseInstallation.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                return ParseInstallation.getCurrentInstallationController().setAsync(ParseInstallation.this);
            }
        });
    }

    @Override // com.parse.ParseObject
    public boolean isKeyMutable(String str) {
        return !READ_ONLY_FIELDS.contains(str);
    }

    @Override // com.parse.ParseObject
    public boolean needsDefaultACL() {
        return false;
    }

    @Override // com.parse.ParseObject
    public Task<Void> saveAsync(final String str, final Task<Void> task) {
        return super.saveAsync(str, task).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseInstallation.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task2) {
                int code;
                Task<Void> taskSaveAsync;
                if (task2.getError() == null || !(task2.getError() instanceof ParseException) || ((code = ((ParseException) task2.getError()).getCode()) != 101 && (code != 135 || ParseInstallation.this.getObjectId() != null))) {
                    return task2;
                }
                synchronized (ParseInstallation.this.mutex) {
                    ParseInstallation parseInstallation = ParseInstallation.this;
                    parseInstallation.setState(new ParseObject.State.Builder(parseInstallation.getState()).objectId(null).build());
                    ParseInstallation.this.markAllFieldsDirty();
                    taskSaveAsync = ParseInstallation.super.saveAsync(str, task);
                }
                return taskSaveAsync;
            }
        });
    }

    public void setDeviceToken(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        performPut("deviceToken", str);
    }

    @Override // com.parse.ParseObject
    public void setObjectId(String str) {
        throw new RuntimeException("Installation's objectId cannot be changed");
    }

    public void setPushType(String str) {
        if (str != null) {
            performPut("pushType", str);
        }
    }

    @Override // com.parse.ParseObject
    public void updateBeforeSave() {
        super.updateBeforeSave();
        if (getCurrentInstallationController().isCurrent(this)) {
            updateTimezone();
            updateVersionInfo();
            updateDeviceInfo();
            updateLocaleIdentifier();
        }
    }

    public void updateDeviceInfo() {
        updateDeviceInfo(ParsePlugins.get().installationId());
    }

    public void updateDeviceInfo(InstallationId installationId) {
        if (!has("installationId")) {
            performPut("installationId", installationId.get());
        }
        if ("android".equals(get("deviceType"))) {
            return;
        }
        performPut("deviceType", "android");
    }
}
