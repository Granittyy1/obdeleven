package com.parse;

import com.parse.boltsinternal.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
class ParseAuthenticationManager {
    private final ParseCurrentUserController controller;
    private final Object lock = new Object();
    private final Map<String, AuthenticationCallback> callbacks = new HashMap();

    public ParseAuthenticationManager(ParseCurrentUserController parseCurrentUserController) {
        this.controller = parseCurrentUserController;
    }

    public Task<Void> deauthenticateAsync(String str) {
        final AuthenticationCallback authenticationCallback;
        synchronized (this.lock) {
            authenticationCallback = this.callbacks.get(str);
        }
        return authenticationCallback != null ? Task.call(new Callable<Void>() { // from class: com.parse.ParseAuthenticationManager.3
            @Override // java.util.concurrent.Callable
            public Void call() {
                authenticationCallback.onRestore(null);
                return null;
            }
        }, ParseExecutors.io()) : Task.forResult(null);
    }

    public Task<Boolean> restoreAuthenticationAsync(String str, final Map<String, String> map) {
        final AuthenticationCallback authenticationCallback;
        synchronized (this.lock) {
            authenticationCallback = this.callbacks.get(str);
        }
        return authenticationCallback == null ? Task.forResult(Boolean.TRUE) : Task.call(new Callable<Boolean>() { // from class: com.parse.ParseAuthenticationManager.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                return Boolean.valueOf(authenticationCallback.onRestore(map));
            }
        }, ParseExecutors.io());
    }
}
