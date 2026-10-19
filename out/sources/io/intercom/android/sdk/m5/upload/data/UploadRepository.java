package io.intercom.android.sdk.m5.upload.data;

import Aa.c;
import android.content.Context;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Upload;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import okhttp3.s;
import okhttp3.y;

/* JADX INFO: compiled from: UploadRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadRepository {
    public static final int $stable = 8;
    private final Context context;
    private final ExternalUploadApi externalUploadApi;
    private final MessengerApi messengerApi;
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.upload.data.UploadRepository$uploadFile$1, reason: invalid class name */
    /* JADX INFO: compiled from: UploadRepository.kt */
    @c(c = "io.intercom.android.sdk.m5.upload.data.UploadRepository", f = "UploadRepository.kt", l = {R.styleable.AppCompatTheme_autoCompleteTextViewStyle, R.styleable.AppCompatTheme_buttonBarStyle}, m = "uploadFile")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UploadRepository.this.uploadFile(null, this);
        }
    }

    public UploadRepository() {
        this(null, null, null, null, 15, null);
    }

    public final Context getContext() {
        return this.context;
    }

    public final UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object uploadFile(MediaData.Media media, kotlin.coroutines.c<? super NetworkResponse<Upload.Builder>> cVar) {
        AnonymousClass1 anonymousClass1;
        UploadRepository uploadRepository;
        NetworkResponse networkResponse;
        NetworkResponse networkResponse2;
        MediaData.Media media2 = media;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object uploadFileUrlSuspended = anonymousClass2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass2.label;
        if (i11 != 0) {
            if (i11 == 1) {
                media2 = (MediaData.Media) anonymousClass2.L$1;
                uploadRepository = (UploadRepository) anonymousClass2.L$0;
                b.b(uploadFileUrlSuspended);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                networkResponse = (NetworkResponse) anonymousClass2.L$0;
                b.b(uploadFileUrlSuspended);
            }
            networkResponse2 = (NetworkResponse) uploadFileUrlSuspended;
            if ((networkResponse2 instanceof NetworkResponse.ClientError) || (networkResponse2 instanceof NetworkResponse.NetworkError) || (networkResponse2 instanceof NetworkResponse.ServerError)) {
                return networkResponse2;
            }
            if (networkResponse2 instanceof NetworkResponse.Success) {
                return networkResponse;
            }
            throw new NoWhenBranchMatchedException();
        }
        b.b(uploadFileUrlSuspended);
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("original_filename", media.getFileName());
        mapBuilder.put("size_in_bytes", new Long(media.getSize()));
        mapBuilder.put("content_type", media.getMimeType());
        if (media2 instanceof MediaData.Media.Image) {
            MediaData.Media.Image image = (MediaData.Media.Image) media2;
            mapBuilder.put("width", new Integer(image.getWidth()));
            mapBuilder.put("height", new Integer(image.getHeight()));
        }
        if (media2 instanceof MediaData.Media.Video) {
            MediaData.Media.Video video = (MediaData.Media.Video) media2;
            mapBuilder.put("width", new Integer(video.getWidth()));
            mapBuilder.put("height", new Integer(video.getHeight()));
        }
        y defaultRequestBody$intercom_sdk_base_release = MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(kotlin.collections.y.s(new Pair("upload", mapBuilder.k()), new Pair(Participant.USER_TYPE, this.userIdentity.toMap()), new Pair("include_metadata", Boolean.TRUE)));
        MessengerApi messengerApi = this.messengerApi;
        anonymousClass2.L$0 = this;
        anonymousClass2.L$1 = media2;
        anonymousClass2.label = 1;
        uploadFileUrlSuspended = messengerApi.getUploadFileUrlSuspended(defaultRequestBody$intercom_sdk_base_release, anonymousClass2);
        if (uploadFileUrlSuspended == coroutineSingletons) {
            return coroutineSingletons;
        }
        uploadRepository = this;
        NetworkResponse networkResponse3 = (NetworkResponse) uploadFileUrlSuspended;
        if ((networkResponse3 instanceof NetworkResponse.ClientError) || (networkResponse3 instanceof NetworkResponse.NetworkError) || (networkResponse3 instanceof NetworkResponse.ServerError)) {
            return networkResponse3;
        }
        if (!(networkResponse3 instanceof NetworkResponse.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        Upload uploadBuild = ((Upload.Builder) ((NetworkResponse.Success) networkResponse3).getBody()).build();
        ExternalUploadApi externalUploadApi = uploadRepository.externalUploadApi;
        String uploadDestination = uploadBuild.getUploadDestination();
        String key = uploadBuild.getKey();
        i.d(key, "getKey(...)");
        s.c cVarA = s.c.a.a("key", key);
        String acl = uploadBuild.getAcl();
        i.d(acl, "getAcl(...)");
        s.c cVarA2 = s.c.a.a("acl", acl);
        String contentType = uploadBuild.getContentType();
        i.d(contentType, "getContentType(...)");
        s.c cVarA3 = s.c.a.a("Content-Type", contentType);
        String awsAccessKey = uploadBuild.getAwsAccessKey();
        i.d(awsAccessKey, "getAwsAccessKey(...)");
        s.c cVarA4 = s.c.a.a("AWSAccessKeyId", awsAccessKey);
        String policy = uploadBuild.getPolicy();
        i.d(policy, "getPolicy(...)");
        s.c cVarA5 = s.c.a.a("policy", policy);
        String signature = uploadBuild.getSignature();
        i.d(signature, "getSignature(...)");
        s.c cVarA6 = s.c.a.a("signature", signature);
        String successActionStatus = uploadBuild.getSuccessActionStatus();
        i.d(successActionStatus, "getSuccessActionStatus(...)");
        s.c cVarA7 = s.c.a.a("success_action_status", successActionStatus);
        s.c cVarA8 = s.c.a.a("x-amz-meta-safe_app_id", uploadBuild.getMetadata().getSafeAppId());
        s.c cVarB = s.c.a.b("file", media2.getFileName(), new UploadRequestBody(uploadRepository.context, media2));
        anonymousClass2.L$0 = networkResponse3;
        anonymousClass2.L$1 = null;
        anonymousClass2.label = 2;
        Object objUploadFileSuspended = externalUploadApi.uploadFileSuspended(uploadDestination, cVarA, cVarA2, cVarA3, cVarA4, cVarA5, cVarA6, cVarA7, cVarA8, cVarB, anonymousClass2);
        if (objUploadFileSuspended == coroutineSingletons) {
            return coroutineSingletons;
        }
        networkResponse = networkResponse3;
        uploadFileUrlSuspended = objUploadFileSuspended;
        networkResponse2 = (NetworkResponse) uploadFileUrlSuspended;
        if (networkResponse2 instanceof NetworkResponse.ClientError) {
            if (networkResponse2 instanceof NetworkResponse.Success) {
                return networkResponse;
            }
            throw new NoWhenBranchMatchedException();
        }
        return networkResponse2;
    }

    public UploadRepository(MessengerApi messengerApi, ExternalUploadApi externalUploadApi, UserIdentity userIdentity, Context context) {
        i.e(messengerApi, "messengerApi");
        i.e(externalUploadApi, "externalUploadApi");
        i.e(userIdentity, "userIdentity");
        i.e(context, "context");
        this.messengerApi = messengerApi;
        this.externalUploadApi = externalUploadApi;
        this.userIdentity = userIdentity;
        this.context = context;
    }

    public /* synthetic */ UploadRepository(MessengerApi messengerApi, ExternalUploadApi externalUploadApi, UserIdentity userIdentity, Context context, int i10, e eVar) {
        this((i10 & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i10 & 2) != 0 ? Injector.get().getExternalUploadApi() : externalUploadApi, (i10 & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i10 & 8) != 0 ? Injector.get().getApplication() : context);
    }
}
