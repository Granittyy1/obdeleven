package p005a4;

import Z3.q;
import android.content.Context;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.PersistedEvents;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.i;
import p165n4.s;

/* JADX INFO: compiled from: AppEventDiskStore.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: compiled from: AppEventDiskStore.kt */
    public static final class a extends ObjectInputStream {
        @Override // java.io.ObjectInputStream
        public final ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (i.a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                resultClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (i.a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                resultClassDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            i.d(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    static {
        new d();
    }

    public static final synchronized PersistedEvents a() {
        PersistedEvents persistedEvents;
        a aVar;
        Throwable th;
        File fileStreamPath;
        Context contextA = q.a();
        persistedEvents = null;
        try {
            try {
                FileInputStream fileInputStreamOpenFileInput = contextA.openFileInput("AppEventsLogger.persistedevents");
                i.d(fileInputStreamOpenFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                aVar = new a(new BufferedInputStream(fileInputStreamOpenFileInput));
                try {
                    Object object = aVar.readObject();
                    if (object == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                    }
                    PersistedEvents persistedEvents2 = (PersistedEvents) object;
                    s.e(aVar);
                    try {
                        contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                    persistedEvents = persistedEvents2;
                    if (persistedEvents == null) {
                        persistedEvents = new PersistedEvents();
                    }
                } catch (FileNotFoundException unused2) {
                    s.e(aVar);
                    fileStreamPath = contextA.getFileStreamPath("AppEventsLogger.persistedevents");
                    fileStreamPath.delete();
                } catch (Exception unused3) {
                    s.e(aVar);
                    fileStreamPath = contextA.getFileStreamPath("AppEventsLogger.persistedevents");
                    fileStreamPath.delete();
                } catch (Throwable th2) {
                    th = th2;
                    s.e(aVar);
                    try {
                        contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused4) {
                    }
                    throw th;
                }
            } catch (Exception unused5) {
            }
        } catch (FileNotFoundException unused6) {
            aVar = null;
        } catch (Exception unused7) {
            aVar = null;
        } catch (Throwable th3) {
            aVar = null;
            th = th3;
        }
        return persistedEvents;
    }

    public static final void b(PersistedEvents persistedEvents) {
        Context contextA = q.a();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(contextA.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(persistedEvents);
                s.e(objectOutputStream2);
            } catch (Throwable unused) {
                objectOutputStream = objectOutputStream2;
                try {
                    contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused2) {
                } finally {
                    s.e(objectOutputStream);
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
