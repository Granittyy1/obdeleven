package P8;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: MemoryLogger.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteArrayOutputStream f4965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PrintWriter f4966c;

    public e() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f4965b = byteArrayOutputStream;
        this.f4966c = new PrintWriter(byteArrayOutputStream);
    }

    @Override // P8.d
    public final void b(int i10, String str, String str2) {
        String str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        PrintWriter printWriter = this.f4966c;
        printWriter.print(simpleDateFormat.format(new Date()));
        printWriter.print(' ');
        switch (i10) {
            case 2:
                str3 = "V";
                break;
            case 3:
                str3 = "D";
                break;
            case 4:
                str3 = "I";
                break;
            case 5:
                str3 = "W";
                break;
            case 6:
                str3 = "E";
                break;
            case 7:
                str3 = "WTF";
                break;
            default:
                str3 = "?";
                break;
        }
        printWriter.println(str3 + "/" + str + "." + str2);
        printWriter.flush();
    }

    @Override // P8.d
    public final void c(Throwable th) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        PrintWriter printWriter = this.f4966c;
        printWriter.print(simpleDateFormat.format(new Date()));
        printWriter.print(' ');
        th.printStackTrace(printWriter);
        printWriter.flush();
    }

    @Override // P8.d
    public final void d() {
        PrintWriter printWriter = this.f4966c;
        printWriter.flush();
        printWriter.close();
    }
}
