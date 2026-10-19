package R0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.InterfaceC1363f;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: EmojiCompatInitializer.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC1363f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f5147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f5148c;

    public e(EmojiCompatInitializer emojiCompatInitializer, Lifecycle lifecycle) {
        this.f5148c = emojiCompatInitializer;
        this.f5147b = lifecycle;
    }

    @Override // androidx.lifecycle.InterfaceC1363f
    public final void c(InterfaceC1376t interfaceC1376t) {
        this.f5148c.getClass();
        (Build.VERSION.SDK_INT >= 28 ? c.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new EmojiCompatInitializer.c(), 500L);
        this.f5147b.c(this);
    }
}
