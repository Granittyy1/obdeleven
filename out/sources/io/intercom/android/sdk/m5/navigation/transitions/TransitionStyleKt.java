package io.intercom.android.sdk.m5.navigation.transitions;

import android.os.Bundle;
import com.google.gson.Gson;
import kotlin.jvm.internal.i;
import p141l2.L;

/* JADX INFO: compiled from: TransitionStyle.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TransitionStyleKt {
    private static final L<TransitionArgs> TransitionArgNavType = new L<TransitionArgs>() { // from class: io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt$TransitionArgNavType$1
        private final TransitionArgs toTransitionArgs(String str) {
            Object objD = new Gson().d(TransitionArgs.class, str);
            i.d(objD, "fromJson(...)");
            return (TransitionArgs) objD;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p141l2.L
        public TransitionArgs get(Bundle bundle, String key) {
            i.e(bundle, "bundle");
            i.e(key, "key");
            TransitionArgs transitionArgs = (TransitionArgs) p271w0.b.a(bundle, key, TransitionArgs.class);
            return transitionArgs == null ? new TransitionArgs(null, null, null, null, 15, null) : transitionArgs;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p141l2.L
        public TransitionArgs parseValue(String value) {
            i.e(value, "value");
            return toTransitionArgs(value);
        }

        @Override // p141l2.L
        public void put(Bundle bundle, String key, TransitionArgs value) {
            i.e(bundle, "bundle");
            i.e(key, "key");
            i.e(value, "value");
            bundle.putParcelable(key, value);
        }
    };

    public static final L<TransitionArgs> getTransitionArgNavType() {
        return TransitionArgNavType;
    }
}
