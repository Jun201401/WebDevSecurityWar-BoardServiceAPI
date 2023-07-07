package com.jun201401.webdevsecuritywar.boardserviceapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "files")
public class File {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name="posts_id", nullable=false)
    private Post post;

    @Column(name="file_name", nullable = false)
    private String fileName;

    @Column(name="file_path", nullable = false)
    private String filePath;
}
