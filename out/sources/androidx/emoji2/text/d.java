package androidx.emoji2.text;

import R0.l;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: EmojiCompatInitializer.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.h f17360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f17361b;

    public d(c.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f17360a = hVar;
        this.f17361b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.c.h
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f17361b;
        try {
            this.f17360a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.c.h
    public final void b(l lVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f17361b;
        try {
            this.f17360a.b(lVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
