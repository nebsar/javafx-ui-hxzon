/*
 * Copyright (c) 2008, 2011 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.javafx.experiments.ensemble2.samples.controls.list;

import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.scene.control.ListView;

import com.javafx.experiments.ensemble2.Sample;

/**
 * A powerful multi-row control where each row is defined as a Cell.
 * Supports virtually unlimited numbers of rows. Supports dynamically variable
 * non-homogenous row heights. Can be horizontal or vertical.
 *
 * This is a horizontal list view sample.
 *
 * @see javafx.scene.control.ListView
 * @see javafx.scene.control.SelectionModel
 * @related control/list/ListWithCellFactory
 * @related control/list/SimpleListView
 */
public class HorizontalListViewSample extends Sample {
    public HorizontalListViewSample() {
        ListView horizontalListView = new ListView();
        horizontalListView.setOrientation(Orientation.HORIZONTAL);
        horizontalListView.setItems(FXCollections.observableArrayList("Row 1", "Row 2", "Long Row 3", "Row 4", "Row 5", "Row 6", "Row 7", "Row 8", "Row 9", "Row 10", "Row 11", "Row 12", "Row 13",
                "Row 14", "Row 15", "Row 16", "Row 17", "Row 18", "Row 19", "Row 20"));
        getChildren().add(horizontalListView);
    }
}
