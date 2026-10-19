package com.voltasit.obdeleven.interfaces;

import android.os.Bundle;
import kotlin.enums.a;

/* JADX INFO: compiled from: DialogCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface DialogCallback {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: DialogCallback.kt */
    public static final class CallbackType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CallbackType f31101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CallbackType f31102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final CallbackType f31103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final CallbackType f31104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ CallbackType[] f31105f;

        static {
            CallbackType callbackType = new CallbackType("ON_NEGATIVE", 0);
            f31101b = callbackType;
            CallbackType callbackType2 = new CallbackType("ON_POSITIVE", 1);
            f31102c = callbackType2;
            CallbackType callbackType3 = new CallbackType("ON_NEUTRAL", 2);
            f31103d = callbackType3;
            CallbackType callbackType4 = new CallbackType("ON_ERROR", 3);
            f31104e = callbackType4;
            CallbackType[] callbackTypeArr = {callbackType, callbackType2, callbackType3, callbackType4};
            f31105f = callbackTypeArr;
            a.a(callbackTypeArr);
        }

        public CallbackType() {
            throw null;
        }

        public static CallbackType valueOf(String str) {
            return (CallbackType) Enum.valueOf(CallbackType.class, str);
        }

        public static CallbackType[] values() {
            return (CallbackType[]) f31105f.clone();
        }
    }

    void g(String str, CallbackType callbackType, Bundle bundle);
}
