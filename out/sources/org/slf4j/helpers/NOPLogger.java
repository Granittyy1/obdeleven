package org.slf4j.helpers;

/* JADX INFO: loaded from: classes2.dex */
public class NOPLogger extends MarkerIgnoringBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NOPLogger f45778b = new NOPLogger();
    private static final long serialVersionUID = -517220405410904473L;

    @Override // org.slf4j.helpers.MarkerIgnoringBase, org.slf4j.helpers.NamedLoggerBase, cc.b
    public final String getName() {
        return "NOP";
    }

    @Override // cc.b
    public final void a(String str) {
    }

    @Override // cc.b
    public final void b(String str) {
    }
}
