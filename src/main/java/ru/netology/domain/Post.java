package ru.netology.domain;

public class Post {
    private int postId;
    private int ownerId;
    private int fromId;
    private int data;
    private int createdBy;
    private String content;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private int postponedId;
    private boolean isFavorite;
    private String post_type;
    private LikesInfo likeInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostInfo;
    private ViewsInfo viewInfo;
    private CopyrightInfo copyrightInfo;
    private PostSourceInfo postSourceInfo;
    private GeoInfo geoInfo;
    private DonutInfo donutInfo;
    // + get/set на все поля

}



