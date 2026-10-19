package T0;

import R0.m;
import android.text.Editable;

/* JADX INFO: compiled from: EmojiEditableFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5734a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile b f5735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class<?> f5736c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f5736c;
        return cls != null ? new m(cls, charSequence) : super.newEditable(charSequence);
    }
}
