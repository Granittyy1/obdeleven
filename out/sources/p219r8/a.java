package p219r8;

import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Locale;
import java.util.regex.Pattern;
import p194p8.j;

/* JADX INFO: compiled from: KWP1281SequentialOutputTest.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f46391f;

    /* JADX INFO: renamed from: r8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: KWP1281SequentialOutputTest.java */
    public class C0524a implements Continuation<String, Void> {
        public C0524a() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Void then(Task<String> task) throws Exception {
            String strConcat;
            String str;
            String result = task.getResult();
            if (!result.startsWith("F5")) {
                if (result.startsWith("09") || result.startsWith("0A")) {
                    throw new CommandException(0);
                }
                throw new CommandException(-1);
            }
            a aVar = a.this;
            aVar.f46389d = true;
            int i10 = Integer.parseInt(result.substring(2, 6), 16);
            aVar.f46388c = i10;
            if ((i10 >> 14) == 1) {
                int i11 = (i10 >> 12) & 3;
                if (i11 == 0) {
                    str = "P";
                } else if (i11 == 1) {
                    str = "C";
                } else if (i11 != 2) {
                    str = i11 != 3 ? "" : "U";
                } else {
                    str = "B";
                }
                strConcat = str.concat(String.format(Locale.US, "%d%03d", Integer.valueOf((i10 >> 10) & 3), Integer.valueOf(aVar.f46388c & 1023)));
            } else {
                strConcat = String.format(Locale.US, "%05d", Integer.valueOf(i10));
            }
            aVar.f46390e = strConcat.equals("01195") || strConcat.startsWith("P1AFF");
            aVar.f46391f = Texttabe.c(Pattern.compile("^[BCPU]").matcher(strConcat).find() ? strConcat.concat("00") : "VAG".concat(strConcat));
            return null;
        }
    }

    /* JADX INFO: compiled from: KWP1281SequentialOutputTest.java */
    public class b implements Continuation<String, Void> {
        public b() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Void then(Task<String> task) throws Exception {
            String result = task.getResult();
            if (result.startsWith("FC")) {
                a.this.f46389d = false;
                return null;
            }
            if (result.startsWith("0A")) {
                throw new CommandException(0);
            }
            throw new CommandException(-1);
        }
    }

    @Override // p219r8.e
    public final Task<Void> a() {
        return this.f46400a.f29335r.d("07").continueWith(new b());
    }

    @Override // p219r8.e
    public final boolean b() {
        return this.f46390e;
    }

    @Override // p219r8.e
    public final Task<j> c() {
        return Task.forResult(new p194p8.b(1, this.f46400a));
    }

    @Override // p219r8.e
    public final String d() {
        return this.f46391f;
    }

    @Override // p219r8.e
    public final Task<Void> e() {
        return this.f46400a.f29335r.d("0400").continueWith(new C0524a());
    }

    @Override // p219r8.e
    public final Task<Void> f() {
        return this.f46389d ? Task.forResult(null) : e();
    }

    @Override // p219r8.e
    public final Task<Void> g() {
        return Task.forResult(null);
    }
}
