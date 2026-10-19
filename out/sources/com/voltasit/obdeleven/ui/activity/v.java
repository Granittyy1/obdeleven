package com.voltasit.obdeleven.ui.activity;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.FileProvider;
import com.obdeleven.service.enums.SupportedFunction;
import com.obdeleven.service.exception.CommandException;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import p220r9.B;
import p255u9.C2800c;
import p255u9.E;
import p255u9.F;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33699c;

    public /* synthetic */ v(Object obj, int i10, Object obj2) {
        this.f33697a = i10;
        this.f33698b = obj;
        this.f33699c = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task1) throws CommandException {
        Object obj = this.f33699c;
        Object obj2 = this.f33698b;
        switch (this.f33697a) {
            case 0:
                Task vehicleTask = (Task) obj;
                kotlin.jvm.internal.i.e(vehicleTask, "$vehicleTask");
                kotlin.jvm.internal.i.e(task1, "task1");
                F f10 = (F) task1.getResult();
                if (f10 != null) {
                    E e10 = (E) obj2;
                    e10.put("vehicleModification", f10);
                    e10.saveEventually();
                }
                return vehicleTask;
            case 1:
                ((com.voltasit.obdeleven.utils.bluetooth.m) obj2).getClass();
                String str = (String) obj;
                String strSubstring = str.substring(0, 6);
                String strSubstring2 = str.substring(8, 10);
                String strSubstring3 = str.substring(10);
                int i10 = Integer.parseInt(strSubstring, 16);
                int i11 = ((i10 >> 16) & 255) | ((i10 & 255) << 16) | (65280 & i10);
                int i12 = Integer.parseInt(strSubstring2, 16);
                int length = strSubstring3.length() / 2;
                byte[] bArr = new byte[length];
                for (int i13 = 0; i13 < length; i13++) {
                    int i14 = i13 * 2;
                    bArr[i13] = (byte) Integer.parseInt(strSubstring3.substring(i14, i14 + 2), 16);
                }
                StringBuilder sb2 = new StringBuilder("04");
                StringBuilder sb3 = new StringBuilder(String.format("%02X%02X%02X00%02X", Integer.valueOf(i11 & 255), Integer.valueOf((i11 >> 8) & 255), Integer.valueOf((i11 >> 16) & 255), Integer.valueOf(i12 & 255)));
                for (int i15 = 0; i15 < length; i15++) {
                    sb3.append(String.format("%02X", Integer.valueOf(bArr[i15] & 255)));
                }
                sb2.append(sb3.toString());
                return new Z7.f(sb2.toString(), 8000).a();
            case 2:
                p219r8.b bVar = (p219r8.b) obj2;
                bVar.getClass();
                String str2 = (String) task1.getResult();
                O.e.j(bVar.l(), "Request: " + ((String) obj) + ", Result: " + str2);
                if (!str2.startsWith("71")) {
                    if (str2.startsWith("7F31")) {
                        throw new CommandException(Integer.parseInt(str2.substring(4, 6), 16));
                    }
                    throw new CommandException(-1);
                }
                bVar.f46397f = true;
                bVar.f46398g = bVar.f46400a.M().contains(SupportedFunction.f29300v);
                O.e.j(bVar.l(), "Success. Is advanced: " + bVar.f46398g);
                return null;
            default:
                List<String> list = com.voltasit.obdeleven.a.f29638c;
                Context context = (Context) obj2;
                DatabaseLanguage databaseLanguageValueOf = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(context).c());
                File file = new File(context.getExternalCacheDir(), "chart.csv");
                PrintWriter printWriter = new PrintWriter(new FileWriter(file));
                printWriter.print("time");
                C2800c c2800c = (C2800c) obj;
                for (String str3 : c2800c.getList("labels")) {
                    printWriter.print(';');
                    printWriter.print(str3.replace(';', ','));
                }
                printWriter.print('\n');
                C2800c.a aVar = (C2800c.a) task1.getResult();
                List<String> listA = aVar.a();
                List<C2800c.b> listB = aVar.b();
                long j = Long.parseLong(listA.get(0));
                int i16 = 0;
                while (i16 < listA.size()) {
                    C2800c c2800c2 = c2800c;
                    printWriter.print(Long.parseLong(listA.get(i16)) - j);
                    for (int i17 = 0; i17 < listB.size(); i17++) {
                        List<Float> listD = listB.get(i17).d();
                        printWriter.print(';');
                        if (listD.size() > i16) {
                            printWriter.print(listD.get(i16));
                        }
                    }
                    printWriter.print('\n');
                    i16++;
                    c2800c = c2800c2;
                }
                C2800c c2800c3 = c2800c;
                printWriter.flush();
                printWriter.close();
                StringBuilder sb4 = new StringBuilder();
                B.c(context, (E) c2800c3.getParseObject("vehicle"), sb4, context.getString(R.string.common_obdeleven_chart));
                sb4.append("\r\n");
                sb4.append(context.getString(R.string.common_chart_data));
                sb4.append(':');
                sb4.append("\r\n");
                B.g(context, sb4, (ControlUnitDB) c2800c3.getParseObject("controlUnit"), databaseLanguageValueOf.b());
                sb4.append("    ");
                sb4.append(context.getString(R.string.common_name));
                sb4.append(": ");
                sb4.append(c2800c3.getString("name"));
                sb4.append("\r\n");
                sb4.append("    ");
                sb4.append(context.getString(R.string.common_parameters));
                sb4.append(": ");
                sb4.append("\r\n");
                Iterator it = c2800c3.getList("labels").iterator();
                while (it.hasNext()) {
                    B6.c.f(sb4, "        ", (String) it.next(), "\r\n");
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/csv");
                List<String> list2 = com.voltasit.obdeleven.a.f29638c;
                intent.putExtra("android.intent.extra.EMAIL", new String[]{com.voltasit.obdeleven.a.C0320a.a(context).g()});
                intent.putExtra("android.intent.extra.SUBJECT", context.getString(R.string.common_obdeleven_chart));
                intent.putExtra("android.intent.extra.TEXT", sb4.toString());
                intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(context, context.getPackageName() + ".fileProvider", file));
                return intent;
        }
    }
}
