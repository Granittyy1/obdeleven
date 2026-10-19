package T0;

import android.widget.EditText;

/* JADX INFO: compiled from: EmojiEditTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0081a f5731a;

    /* JADX INFO: renamed from: T0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EmojiEditTextHelper.java */
    public static class C0081a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditText f5732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f5733b;

        public C0081a(EditText editText) {
            this.f5732a = editText;
            g gVar = new g(editText);
            this.f5733b = gVar;
            editText.addTextChangedListener(gVar);
            if (T0.b.f5735b == null) {
                synchronized (T0.b.f5734a) {
                    try {
                        if (T0.b.f5735b == null) {
                            T0.b bVar = new T0.b();
                            try {
                                T0.b.f5736c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, T0.b.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            T0.b.f5735b = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            editText.setEditableFactory(T0.b.f5735b);
        }
    }

    /* JADX INFO: compiled from: EmojiEditTextHelper.java */
    public static class b {
    }

    public a(EditText editText) {
        this.f5731a = new C0081a(editText);
    }
}
